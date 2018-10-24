package com.lanying.shiro;

import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.lanying.service.ISysModelService;
import com.lanying.service.ISysRoleService;
import com.lanying.service.ISysUserService;

public class MyShiroRealm extends AuthorizingRealm {
	
	private ISysUserService sysUserService;
	
	private ISysRoleService sysRoleService;
	
	private ISysModelService sysModelService;
	
	/**
	 * 授权
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		System.out.println("============= 我是授权方法。 =============");
		String loginName = (String) principals.getPrimaryPrincipal();
		if (loginName != null) {
			List<String> roles = sysRoleService.getNamesByLoginName(loginName);
			List<String> perms = sysModelService.getNamesByLoginName(loginName);
			
			SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
			info.addRoles(roles);
			info.addStringPermissions(perms);
			return info;
		}
		return null;
	}
	
	/**
	 * 认证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken authenticationToken) throws AuthenticationException {
		AuthenticationInfo info = null;
		System.out.println("============= 我是认证方法。 =============");
		UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
		// 通过表单接收的用户名，调用currentUser.login的时候执行 
		String loginName = token.getUsername();
		if (loginName != null && !"".equals(loginName)) {
			// 查询密码
			String password = sysUserService.getPasswordByLoginName(loginName);
			if (password != null) {
				info = new SimpleAuthenticationInfo(loginName, password, getName());
			}
		}
		return info;
	}

	public ISysUserService getSysUserService() {
		return sysUserService;
	}

	public void setSysUserService(ISysUserService sysUserService) {
		this.sysUserService = sysUserService;
	}

	public ISysRoleService getSysRoleService() {
		return sysRoleService;
	}

	public void setSysRoleService(ISysRoleService sysRoleService) {
		this.sysRoleService = sysRoleService;
	}

	public ISysModelService getSysModelService() {
		return sysModelService;
	}

	public void setSysModelService(ISysModelService sysModelService) {
		this.sysModelService = sysModelService;
	}
}

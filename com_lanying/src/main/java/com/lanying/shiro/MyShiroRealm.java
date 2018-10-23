package com.lanying.shiro;

import java.util.ArrayList;
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

import com.lanying.dto.SysRole;
import com.lanying.service.ISysUserService;

public class MyShiroRealm extends AuthorizingRealm {
	
	private ISysUserService sysUserService;
	
	/**
	 * ��Ȩ
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		System.out.println("============= ������Ȩ������ =============");
		String loginName = (String) principals.getPrimaryPrincipal();
		if (loginName != null) {
			List<String> roles = sysUserService.querySysRoleListByLoginName(loginName);
			
			List<String> perms = new ArrayList<String>();
			perms.add("permit1");
			perms.add("permit2");
			
			SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
			info.addRoles(roles);
			info.addStringPermissions(perms);
			return info;
		}
		return null;
	}
	
	/**
	 * ��֤
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken authenticationToken) throws AuthenticationException {
		AuthenticationInfo info = null;
		System.out.println("============= ������֤������ =============");
		UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
		// ͨ�������յ��û���������currentUser.login��ʱ��ִ�� 
		String loginName = token.getUsername();
		if (loginName != null && !"".equals(loginName)) {
			// ��ѯ����
			String password = sysUserService.getPasswordByLoginName(loginName);
			if (password != null) {
				info = new SimpleAuthenticationInfo(loginName, password, getName());
			}
		}
		return info;
	}

	public void setSysUserService(ISysUserService sysUserService) {
		this.sysUserService = sysUserService;
	}
}

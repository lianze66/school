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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lanying.service.ISysModelService;
import com.lanying.service.ISysRoleService;
import com.lanying.service.ISysUserService;

public class MyShiroRealm extends AuthorizingRealm {
	
	private static final Logger log = LoggerFactory.getLogger(MyShiroRealm.class);
	
	private ISysUserService sysUserService;
	
	private ISysRoleService sysRoleService;
	
	private ISysModelService sysModelService;
	
	/**
	 * ��Ȩ
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		log.info("============= ������Ȩ������ =============");
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
	 * ��֤
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken authenticationToken) throws AuthenticationException {
		AuthenticationInfo info = null;
		log.info("============= ������֤������ =============");
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
	
	public void setSysRoleService(ISysRoleService sysRoleService) {
		this.sysRoleService = sysRoleService;
	}

	public void setSysModelService(ISysModelService sysModelService) {
		this.sysModelService = sysModelService;
	}
}

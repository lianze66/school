package com.lanying.shiro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class MyShiroRealm extends AuthorizingRealm {
	
	private static Map<String, String> userInfoMap;
	
	static {
		userInfoMap = new HashMap<String, String>();
		userInfoMap.put("lianze", "123456");
		userInfoMap.put("andy", "123456");
		userInfoMap.put("coco", "123456");
	}

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String username = (String) principals.fromRealm(getName()).iterator().next();
		if (username != null) {
			List<String> perms = new ArrayList<String>();
			perms.add("role1");
			perms.add("role2");
			
			if (perms != null && !perms.isEmpty()) {
				SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
				for (String each : perms) {
					// 将权限资源添加到用户信息中
					info.addStringPermission(each);
				}
				return info;
			}
		}
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken authenticationToken) throws AuthenticationException {
		UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
		// 通过表单接收的用户名，调用currentUser.login的时候执行 
		String username = token.getUsername();
		if (username != null && !"".equals(username)) {
			// 查询密码
			String password = userInfoMap.get(username);
			if (password != null) {
				return new SimpleAuthenticationInfo(username, password, getName());
			}
		}
		return null;
	}
}

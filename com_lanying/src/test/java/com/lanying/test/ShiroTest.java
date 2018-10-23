package com.lanying.test;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShiroTest {

	private static final transient Logger log = LoggerFactory.getLogger(ShiroTest.class);

	public static void main(String[] args) {
		// 1. 这里的SecurityManager是org.apache.shiro.mgt.SecurityManager
		// 而不是java.lang.SecurityManager 
		// 加载配置文件
		Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");
		// 2.解析配置文件，并且返回一些SecurityManger实例 
		SecurityManager securityManager = factory.getInstance();
		// 3.将SecurityManager绑定给SecurityUtils
		SecurityUtils.setSecurityManager(securityManager);
		// 安全操作，Subject是当前登录的用户
		Subject currentUser = SecurityUtils.getSubject();

		// 测试在应用的当前会话中设置属性
		Session session = currentUser.getSession();
		// 放进去一个key和一个value 
		session.setAttribute("someKey", "aValue");
		// 根据key拿到value 
		String value = (String) session.getAttribute("someKey");
		if ("aValue".equals(value)) {// 比较拿到的值和原来的值是否一致
			log.info("检索到正确的值[" + value + "]");
		}
		// 尝试进行登录用户，如果登录失败了，我们进行一些处理
		if (!currentUser.isAuthenticated()) {// 如果用户没有登录过
			// new UsernamePasswordToken(用户名,密码) 
			UsernamePasswordToken token = new UsernamePasswordToken("lianze", "123456");
			token.setRememberMe(true);// 是否记住用户
			try {
				currentUser.login(token);
				// 当我们获登录用户之后
				log.info("用户 [" + currentUser.getPrincipal() + "] 登陆成功");
				// 查看用户是否有指定的角色
				if (currentUser.hasRole("admin")) {
					log.info("您有admin角色");
				} else {
					log.info("您没有admin角色");
				}
				if (currentUser.hasRole("role1")) {
					log.info("您有role1角色");
				} else {
					log.info("您没有role1角色");
				}

				// 查看用户是否有某个权限
				if (currentUser.isPermitted("perm1")) {
					log.info("您有perm1权限");
				} else {
					log.info("您没有perm1权限");
				}
				if (currentUser.isPermitted("guest")) {
					log.info("您有guest权限");
				} else {
					log.info("您没有guest权限");
				}
				// 登出
				currentUser.logout();
			} catch (UnknownAccountException uae) {
				log.info(token.getPrincipal() + "账户不存在");
			} catch (IncorrectCredentialsException ice) {
				log.info(token.getPrincipal() + "密码不正确");
			} catch (LockedAccountException lae) {
				log.info(token.getPrincipal() + "用户被锁定了 ");
			}
		}
	}
}

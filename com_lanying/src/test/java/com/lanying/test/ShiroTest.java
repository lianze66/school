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
		// 1. �����SecurityManager��org.apache.shiro.mgt.SecurityManager
		// ������java.lang.SecurityManager 
		// ���������ļ�
		Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");
		// 2.���������ļ������ҷ���һЩSecurityMangerʵ�� 
		SecurityManager securityManager = factory.getInstance();
		// 3.��SecurityManager�󶨸�SecurityUtils
		SecurityUtils.setSecurityManager(securityManager);
		// ��ȫ������Subject�ǵ�ǰ��¼���û�
		Subject currentUser = SecurityUtils.getSubject();

		// ������Ӧ�õĵ�ǰ�Ự����������
		Session session = currentUser.getSession();
		// �Ž�ȥһ��key��һ��value 
		session.setAttribute("someKey", "aValue");
		// ����key�õ�value 
		String value = (String) session.getAttribute("someKey");
		if ("aValue".equals(value)) {// �Ƚ��õ���ֵ��ԭ����ֵ�Ƿ�һ��
			log.info("��������ȷ��ֵ[" + value + "]");
		}
		// ���Խ��е�¼�û��������¼ʧ���ˣ����ǽ���һЩ����
		if (!currentUser.isAuthenticated()) {// ����û�û�е�¼��
			// new UsernamePasswordToken(�û���,����) 
			UsernamePasswordToken token = new UsernamePasswordToken("lianze", "123456");
			token.setRememberMe(true);// �Ƿ��ס�û�
			try {
				currentUser.login(token);
				// �����ǻ��¼�û�֮��
				log.info("�û� [" + currentUser.getPrincipal() + "] ��½�ɹ�");
				// �鿴�û��Ƿ���ָ���Ľ�ɫ
				if (currentUser.hasRole("admin")) {
					log.info("����admin��ɫ");
				} else {
					log.info("��û��admin��ɫ");
				}
				if (currentUser.hasRole("role1")) {
					log.info("����role1��ɫ");
				} else {
					log.info("��û��role1��ɫ");
				}

				// �鿴�û��Ƿ���ĳ��Ȩ��
				if (currentUser.isPermitted("perm1")) {
					log.info("����perm1Ȩ��");
				} else {
					log.info("��û��perm1Ȩ��");
				}
				if (currentUser.isPermitted("guest")) {
					log.info("����guestȨ��");
				} else {
					log.info("��û��guestȨ��");
				}
				// �ǳ�
				currentUser.logout();
			} catch (UnknownAccountException uae) {
				log.info(token.getPrincipal() + "�˻�������");
			} catch (IncorrectCredentialsException ice) {
				log.info(token.getPrincipal() + "���벻��ȷ");
			} catch (LockedAccountException lae) {
				log.info(token.getPrincipal() + "�û��������� ");
			}
		}
	}
}

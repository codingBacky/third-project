package com.backy.user;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.backy.user.dao.UserDao;
import com.backy.user.domain.User;

public class UserDaoTest {
	@Test
	public void addNget() {
		User user = new User();//입력할때 전달한 유저
		user.setId("backy"); user.setName("hyeony"); user.setPassword("backy1234");
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		UserDao dao = (UserDao) context.getBean("userDao");
		int result = dao.add(user);
		System.out.println(user.getId() + "등록 성공");
		User getUser = dao.get(user.getId());//가져온 유저
		System.out.println(getUser.getName());
		System.out.println(getUser.getPassword());
		System.out.println(getUser.getId() + "조회 성공!!!");
			
			/*if( result != 1 ) {
			System.out.println("등록 실패");
		
		System.out.println(user.getId() + "등록 성공");실패만 알려주면 됨 이건 필요 없음
	  */
	
	}

}

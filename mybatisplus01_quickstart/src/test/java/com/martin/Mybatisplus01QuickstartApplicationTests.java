package com.martin;

import com.martin.dao.UserDao;
import com.martin.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mybatisplus01QuickstartApplicationTests {

	@Autowired
	private UserDao userdao;

	@Test
	void testGetAll() {
		List<User> users = userdao.selectList(null);
		System.out.println(users);
	}

	@Test
	void testSave(){
		User user = new User();
		user.setName("Martin");
		user.setPassword("123123");
		user.setAge(22);
		user.setTel("17768031372");
		userdao.insert(user);
	}

	@Test
	void testDelete() {
		userdao.deleteById(1558298531217907713L);
	}

	@Test
	void testUpdate() {
		User user = new User();
		user.setId(1L);
		user.setAge(99);
		userdao.updateById(user);
	}
}

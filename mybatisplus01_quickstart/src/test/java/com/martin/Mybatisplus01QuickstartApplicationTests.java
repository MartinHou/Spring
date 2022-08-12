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

}

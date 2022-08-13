package com.martin;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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

	@Test
	void testGetByPage(){
		// 需要设定拦截器，在config.MpConfig
		IPage page = new Page(1,2);
		userdao.selectPage(page,null);
		System.out.println("当前页码值: "+page.getCurrent());
		System.out.println("每页显示数: "+page.getSize());
		System.out.println("共多少页: "+page.getPages());
		System.out.println("共多少条数据: "+page.getTotal());
		System.out.println("数据: "+page.getRecords());

	}
}

package com.martin;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.martin.dao.UserDao;
import com.martin.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class Mybatisplus02DqlApplicationTests {

    @Autowired
    private UserDao userdao;

    @Test
    void testGetAll() {
        // 方式一：按条件查询
//        QueryWrapper qw = new QueryWrapper();
//        qw.lt("age", 20);
//        List<User> users = userdao.selectList(qw);
//        System.out.println(users);

        // 方式二：lambda
//        QueryWrapper<User> qw = new QueryWrapper<>(); // 必须带范型
//        qw.lambda().lt(User::getAge, 20);
//        List<User> users = userdao.selectList(qw);
//        System.out.println(users);

        // 方式三（大多情况用）：lambda精简
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
        lqw.lt(User::getAge, 20).gt(User::getAge,10); // 链式（AND）
//        lqw.lt(User::getAge, 10).or().gt(User::getAge,3 0); // 链式（OR）
        List<User> users = userdao.selectList(lqw);
        System.out.println(users);

        // lqw.lt(null != xxx , User::getAge , xxx) 判断是否输入条件为空

        // lt le gt ge eq between
        // like
        LambdaQueryWrapper<User> lqw1 = new LambdaQueryWrapper<>();
        lqw1.like(User::getName, "M");  // 还有likeLeft, likeRight
    }

    @Test
    void testCastGet(){
        // 查询投影(2种Wrapper对应两种方式)
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
        lqw.select(User::getName, User::getAge);
//        QueryWrapper<User> lqw = new QueryWrapper<>();
//        lqw.select("name", "age");
        List<User> users = userdao.selectList(lqw);
        System.out.println(users);
    }

    @Test
    void testCount(){
        // 查询投影
        // 只能用这种Wrapper计数
        QueryWrapper<User> lqw = new QueryWrapper<>();
        lqw.select("count(*) as count,name");
        lqw.groupBy("name");
        List<Map<String, Object>> maps = userdao.selectMaps(lqw);
        System.out.println(maps);
    }

}

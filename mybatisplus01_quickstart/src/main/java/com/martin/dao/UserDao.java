package com.martin.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.martin.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper()
public interface UserDao extends BaseMapper<User> {

}

package com.martin.dao;

import com.martin.domain.Book;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookDao {

    @Insert("insert into tbl_book values(null,#{type},#{name},#{description})") // #{book中的属性，不是表属性名}
    int save(Book book);

    @Update("update tbl_book set type = #{type}, name = #{name}, description = #{description} where id = #{id}")
    int update(Book book);

    @Delete("delete from tbl_book where id = #{id}")
    int delete(Integer id);

    @Select("select * from tbl_book where id = #{id}")
    Book getById(Integer id);

    @Select("select * from tbl_book")
    List<Book> getAll();
}

package com.martin.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

//@Setter
//@Getter
//@ToString
//@EqualsAndHashCode
//上面四个和下面这个等效
@Data
@TableName("t_user")    // 映射到表名
public class User {
    @TableField(value = "id")   // 映射到数据库表的字段名
    private Long id;
    private String name;
    @TableField(select = false) // 不参与查询
    private String password;
    private Integer age;
    private String tel;

    @TableField(exist = false)
    private boolean online; // 不在表中有，只在java类中使用
}

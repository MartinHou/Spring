package com.martin.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

//@Setter
//@Getter
//@ToString
//@EqualsAndHashCode
//上面四个和下面这个等效
@Data
//@TableName("t_user")    // 映射到表名(在yml完成)
public class User {
//    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private String password;
    private Integer age;
    private String tel;

    //逻辑删除字段
//    @TableLogic(value = "0",delval = "1") (在yml完成)
    private Integer deleted;

    // 乐观锁，2000以内并发有效
    @Version
    private Integer version;
}

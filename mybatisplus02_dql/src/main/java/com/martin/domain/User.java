package com.martin.domain;

import lombok.Data;

//@Setter
//@Getter
//@ToString
//@EqualsAndHashCode
//上面四个和下面这个等效
@Data
public class User {
    private Long id;
    private String name;
    private String password;
    private Integer age;
    private String tel;
}

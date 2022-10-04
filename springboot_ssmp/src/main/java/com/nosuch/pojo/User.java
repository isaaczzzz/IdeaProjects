package com.nosuch.pojo;

//lombok

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String gender;
    private String addr;
}

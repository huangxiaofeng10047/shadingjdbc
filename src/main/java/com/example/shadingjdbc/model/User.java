package com.example.shadingjdbc.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

@Data
@TableName("user")
public class User extends Model<User> {
    private Long id;
    private String name;
    private Integer age;
}

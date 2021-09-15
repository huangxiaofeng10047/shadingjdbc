package com.example.shadingjdbc;

import java.util.List;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.shadingjdbc.model.User;
import com.example.shadingjdbc.service.UserService;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShadingjdbcApplicationTests {

    @Autowired
    private UserService userService;
    @Test
    public void addUserDb() {
        for (int i = 21; i < 40; i++) {
            User user = new User();
            user.setName("zhangsan"+i);
            user.setAge(i);
            userService.insert(user);
        }
    }

    @Test
    public void findAllUser() {
        List<User> userList = userService.findAll();
        System.out.println(userList.size());
    }

    @Test
    public void findUser() {
        User user = userService.findById(1437958793404006401L);
        System.out.println(user.getName());
    }
    @Test
    public  void pageAll(){
        Page<User> page = new Page<>(2, 10);
        val it= userService.queryList(page, 1);
        it.stream().forEach(System.out::println);
    }
}

package com.example;

import com.example.entity.master.Account;
import com.example.entity.second.Order;
import com.example.service.master.AccountService;
import com.example.service.second.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisplusDynamicApplicationTests {

    @Autowired
    private AccountService accountService;
    @Autowired
    private OrderService orderService;
    @Test
    void contextLoads() {
        System.out.println("11111");

        List<Account> list = accountService.list();
        System.out.println(list);

        List<Order> orderList = orderService.list();
        System.out.println(orderList);
    }

}

package com.example.service.impl.second;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.second.Order;
import com.example.service.second.OrderService;
import com.example.mapper.second.OrderMapper;
import org.springframework.stereotype.Service;

/**
* @author lenovo
* @description 针对表【t_order】的数据库操作Service实现
* @createDate 2025-06-21 16:06:00
*/
@DS("joeOrder")
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
    implements OrderService{

}





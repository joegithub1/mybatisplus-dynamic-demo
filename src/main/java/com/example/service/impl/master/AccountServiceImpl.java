package com.example.service.impl.master;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.master.Account;
import com.example.service.master.AccountService;
import com.example.mapper.master.AccountMapper;
import org.springframework.stereotype.Service;

/**
* @author lenovo
* @description 针对表【t_account】的数据库操作Service实现
* @createDate 2025-06-21 16:03:32
*/
@DS("joeAccount")
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account>
    implements AccountService{

}





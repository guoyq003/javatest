package com.jd.spring.demo.annotation.service;

import com.jd.spring.demo.annotation.respository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired//装配参数如果不加该参数则会报空指针的错误
    private UserRespository userRespository;
    //或者Autowired加到set方法前也可以
    public void setUserRespository(UserRespository userRespository) {
        this.userRespository = userRespository;
    }

    public void add(){
        System.out.println("UserService add...");
        userRespository.save();
    }
}

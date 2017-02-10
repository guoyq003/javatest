package com.jd.spring.demo.annotation.respository;

import org.springframework.stereotype.Repository;

@Repository("userRespository")//指定名称为userRespository，默认的为userRespositoryImpl
public class UserRespositoryImpl implements UserRespository{

    public void save() {
        System.out.println("UserRespository save...");
    }
}

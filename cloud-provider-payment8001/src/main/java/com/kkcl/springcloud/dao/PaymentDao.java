package com.kkcl.springcloud.dao;

import com.kkcl.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Mapper
public interface PaymentDao {
    public  int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}

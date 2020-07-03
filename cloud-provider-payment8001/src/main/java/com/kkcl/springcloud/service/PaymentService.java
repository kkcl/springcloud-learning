package com.kkcl.springcloud.service;

import com.kkcl.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {

    public  int create(Payment payment);

    public com.kkcl.springcloud.entities.Payment getPaymentById(@Param("id") Long id);


}

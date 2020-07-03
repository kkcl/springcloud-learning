package com.kkcl.springcloud.controller;

import com.kkcl.springcloud.entities.CommonResult;
import com.kkcl.springcloud.entities.Payment;
import com.kkcl.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;


    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        Integer result = paymentService.create(payment);
        if(result > 0){
            return new CommonResult(200, "插入成功", result);
        }else{
            return new CommonResult(444, "插入失败");
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment result = paymentService.getPaymentById(id);
        if(result != null){
            return new CommonResult(200, "查询成功", result);
        }else{
            return new CommonResult(444, "查询失败");
        }
    }

}

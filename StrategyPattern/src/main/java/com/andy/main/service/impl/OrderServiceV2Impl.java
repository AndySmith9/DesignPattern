package com.andy.main.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andy.main.dto.OrderDTO;
import com.andy.main.handler.HandlerContext;
import com.andy.main.service.OrderService;




@Service
public class OrderServiceV2Impl implements OrderService {

    @Autowired
    private HandlerContext handlerContext;

    @Override
    public String handle(OrderDTO dto) {
    	OrderService handler = handlerContext.getInstance(dto.getType());
        return handler.handle(dto);
    }

}

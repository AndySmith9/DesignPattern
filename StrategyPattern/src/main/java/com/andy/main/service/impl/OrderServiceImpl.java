package com.andy.main.service.impl;


import org.springframework.stereotype.Service;

import com.andy.main.dto.OrderDTO;
import com.andy.main.enumeration.OrderType;
import com.andy.main.service.OrderService;



@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public String handle(OrderDTO dto) {
    	String result = null;
        String type = dto.getType();
        if (OrderType.NormalOrder.getType().equals(type)) {
        	result = "处理普通订单";
        } else if (OrderType.GroupOrder.getType().equals(type)) {
        	result = "处理团购订单";
        } else if (OrderType.PromotionOrder.getType().equals(type)) {
        	result = "处理促销订单";
        }
        return result;
    }

}

package com.andy.main.handler;


import org.springframework.stereotype.Component;

import com.andy.main.annotation.HandlerType;
import com.andy.main.dto.OrderDTO;
import com.andy.main.service.OrderService;
import com.andy.main.enumeration.OrderType;



@Component
@HandlerType(value=OrderType.GroupOrder)
public class GroupHandler implements OrderService {

    @Override
    public String handle(OrderDTO dto) {
        return "处理团购订单";
    }

}

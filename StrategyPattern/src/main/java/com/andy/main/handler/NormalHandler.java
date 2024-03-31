package com.andy.main.handler;


import org.springframework.stereotype.Component;

import com.andy.main.annotation.HandlerType;
import com.andy.main.dto.OrderDTO;
import com.andy.main.service.OrderService;
import com.andy.main.enumeration.OrderType;



@Component
@HandlerType(value=OrderType.NormalOrder)
public class NormalHandler implements OrderService {

    @Override
    public String handle(OrderDTO dto) {
        return "处理普通订单";
    }

}

package com.andy.main.service;

import com.andy.main.dto.OrderDTO;

public interface OrderService {

    /**
     * 根据订单的不同类型作出不同的处理
     *
     * @param dto 订单实体
     * @return 为了简单，返回字符串
     */
    String handle(OrderDTO dto);

}

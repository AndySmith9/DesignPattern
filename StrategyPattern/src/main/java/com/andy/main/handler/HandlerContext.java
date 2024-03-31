package com.andy.main.handler;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;

import com.andy.main.annotation.HandlerType;
import com.andy.main.service.OrderService;

import java.util.HashMap;
import java.util.Map;


@Component
public class HandlerContext  implements BeanPostProcessor {

    private final Map<String, OrderService> handlerMap = new HashMap<>();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
    	HandlerType annotation = AnnotationUtils.findAnnotation(bean.getClass(), HandlerType.class);
        if (ClassUtils.isAssignableValue(OrderService.class,bean) && annotation != null) {
            handlerMap.put(annotation.value().getType(), (OrderService)bean);
        }
        return bean;
    }

    public OrderService getInstance(String type) {
    	OrderService handler = this.handlerMap.get(type);
        if (handler == null) {
            throw new RuntimeException("not.found.orderService");
        }
        return handler;
    }



}

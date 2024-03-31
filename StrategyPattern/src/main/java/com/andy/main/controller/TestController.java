package com.andy.main.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andy.main.dto.OrderDTO;
import com.andy.main.service.OrderService;

@RestController
public class TestController {

	@Resource
	private OrderService orderServiceImpl;
	@Resource
	private OrderService orderServiceV2Impl;
	
	
	@RequestMapping("/normal")
	public String normal(String type) {
		 System.out.println(orderServiceImpl.handle(new OrderDTO(type)));
		 System.out.println(orderServiceImpl);
		
		
		return "success";
	}
	
	@RequestMapping("/strategy")
	public String strategy(String type) {
		 System.out.println(orderServiceV2Impl.handle(new OrderDTO(type)));
		 System.out.println(orderServiceV2Impl);
		
		
		return "success";
	}
	
	
	
}

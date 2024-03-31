package com.andy.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andy.main.pojo.User;
import com.andy.main.pojo.User2;



/**
 * Builder Pattern(建造者模式)
 * 可以通过组件组合建造不同的对象.
 * 
 * 建造者模式使用场景举例
 * 一个类有10000个成员变量,创建只有一个成员变量有值的该类对象
 * 
 */


@RestController
public class TestController {

	@RequestMapping("/normal")
	public String normal() {
		
		String name2 = null ;
		int age2 = 34;
		int height2 = 0  ;
		int weight2 = 0 ;
		char sex2 = 0 ;
		double beauty2 = 0 ;
		boolean leader2 = false ;
		
		
		User2 user2 = new User2(age2,name2,height2,weight2,sex2,beauty2,leader2);
		System.out.println(user2);	
		User2 user22 = new User2();
		System.out.println(user22);
		
		return "success";
	}
	
	
	@RequestMapping("/builder")
	public String builder() {
		String name = "Andy";
		int age = 34;
		int height = 170;
		int weight = 67;
		char sex = '男';
		double beauty = 83.2;
		boolean leader = true;
		
		User user = User.builder().age(age).build();
		System.out.println(user);
		
		
		return "success";
	}
	
}

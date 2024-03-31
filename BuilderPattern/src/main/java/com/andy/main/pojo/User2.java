package com.andy.main.pojo;

public class User2 {
	private int age;
	private String name;
	private int height;
	private int weight;
	private char sex;
	private double beauty;
	private boolean leader;
	
	

	public User2(int age, String name, int height, int weight, char sex, double beauty, boolean leader) {
		super();
		this.age = age;
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.sex = sex;
		this.beauty = beauty;
		this.leader = leader;
	}



	public User2() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "User2 [age=" + age + ", name=" + name + ", height=" + height + ", weight=" + weight + ", sex=" + sex
				+ ", beauty=" + beauty + ", leader=" + leader + "]";
	}

	
	
	
	
}

package com.andy.main.pojo;

public class User {

	private int age;
	private String name;
	private int height;
	private int weight;
	private char sex;
	private double beauty;
	private boolean leader;
	

	public User(int age, String name, int height, int weight, char sex, double beauty, boolean leader) {
		super();
		this.age = age;
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.sex = sex;
		this.beauty = beauty;
		this.leader = leader;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static UserBuilder builder() {
		return new UserBuilder();
	}
	

	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + ", height=" + height + ", weight=" + weight + ", sex=" + sex
				+ ", beauty=" + beauty + ", leader=" + leader + "]";
	}


	public static class UserBuilder{
		private int age;
		private String name;
		private int height;
		private int weight;
		private char sex;
		private double beauty;
		private boolean leader;
		
		public UserBuilder age(int age) {
			this.age=age;
			return this;
		}
		public UserBuilder name(String name) {
			this.name=name;
			return this;
		}
		public UserBuilder height(int height) {
			this.height=height;
			return this;
		}
		public UserBuilder weight(int weight) {
			this.weight=weight;
			return this;
		}
		public UserBuilder sex(char sex) {
			this.sex=sex;
			return this;
		}
		public UserBuilder beauty(double beauty) {
			this.beauty=beauty;
			return this;
		}
		public UserBuilder leader(boolean leader) {
			this.leader=leader;
			return this;
		}
		public User build() {
			return new User(age,name,height,weight,sex,beauty,leader);
		}
		
	}
	
	
	
	
}

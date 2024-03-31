package com.andy.main.enumeration;

public enum OrderType {
	NormalOrder("1"),GroupOrder("2"),PromotionOrder("3");
	
	
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	private OrderType(String type) {
		this.type = type;
	}
	
}

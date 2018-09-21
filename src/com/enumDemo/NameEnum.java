package com.enumDemo;

public enum NameEnum {
	NAME("周六");
	
	private String name;

	private NameEnum(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}

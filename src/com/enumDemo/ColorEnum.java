package com.enumDemo;

public enum ColorEnum {
	RED("red color", 0),
	GREEN("green color", 1),
	YELLOW("yellow color", 2);
	
	private String color;
	private int id;
	
	private ColorEnum(String color, int id) {
		this.color = color;
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public int getId() {
		return id;
	}
	
	
}

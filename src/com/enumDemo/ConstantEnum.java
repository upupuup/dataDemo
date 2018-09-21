package com.enumDemo;

public enum ConstantEnum {
	
	// 相当于 
	STUDENT_ID_ZHANG("001", "学号001");
	
	private String id;
	private String desc;
	
	private ConstantEnum(String id, String desc) {
		this.id = id;
		this.desc = desc;
	}

	public String getId() {
		return id;
	}

	public String getDesc() {
		return desc;
	}
	
}

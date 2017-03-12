package com.zx.entity.test2;

public class User2 {
	private int no;
	
	private String name;
	
	private String message;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "User2 [no=" + no + ", name=" + name + ", message=" + message
				+ "]";
	}
	
}

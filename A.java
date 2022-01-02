package com.spring.ref;

public class A {
	private String x;
	private  B obj;
	
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	public A(String x, B obj) {
		super();
		this.x = x;
		this.obj = obj;
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public B getObj() {
		return obj;
	}

	public void setObj(B obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "A [x=" + x + ",\n obj=" + obj + "]";
	}
	
	

}

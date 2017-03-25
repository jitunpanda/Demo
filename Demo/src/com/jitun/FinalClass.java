package com.jitun;

public final class FinalClass {
	final String finalMethod() { return "something"; }
	public void test() {
		System.out.println("test 1");
	}
	public static void main(String[] args) {
		FinalClass finalClass=new FinalClass();
		System.out.println(finalClass.toString());
		finalClass.test();
		
		System.out.println("test2 ");
	}
	
	public void test2() {
		System.out.println("new test2 method");
	}
}

//i have just added this comment
//System.out.println(finalClass.toString())
package com.kony.test;

public class TestGit {

	public static void main(String[] args) {
		// print statement
		System.out.println("Hello Kony");
		int x =10;
		if(x%2 == 0){
			System.out.println("x is even");
		}else{
			System.out.println("x is odd");
		}
		
		System.out.println("test statement");
    int a =10,b=20;
    System.out.println("a :"+a+" b :"+b);
    a = a+b;
    b = a-b;
    a = a-b;
    System.out.println("Values after swap");
    System.out.println("a :"+a+" b : "+b);
	}

}

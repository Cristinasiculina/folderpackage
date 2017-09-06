package com.edocti.javaintro.Hello;

public class Hello2 {
	private static void arrayTests(String[] args){
	System.out.print("Hello ");
	for (int i = 0; i < args.length - 1; i++){
		System.out.print(args[i] + ", ");
	}
	System.out.println(args[args.length - 1]);
}
	
	public static void main(String[] args){
		arrayTests(args);
		}
	
	private static void arrayTests2(String[] args){
		String greet = "Hello ";
		for (int i = 0; i < args.length - 1; i++){
			greet = greet + args[i] + ", ";
		}
		greet = greet + args[args.length - 1];{
			arrayTests2(args);
		}
	}
	
}
package com.ces2.clase3.model;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BankAccount<T extends Number> {
	
//	public static <T> void display(List<?> t1) {
//		for(T i: t1) {
//			System.out.print(i+" ");
//		}
//	}
	
//	public static void depositar(List<?> money) {
//		money.stream().forEach(System.out::println);
//	}
	
	private T t1;
	
	public BankAccount() {
		
	}
	
	public BankAccount(T t1) {
		this.t1 = t1;
	}
	
	public void display() {
		System.out.println(this.t1);
	}
	
	public void display(T[] t1) {
		for(T i: t1) {
			System.out.print(i+" ");
		}
	}
	
	public static <T> void depositemoney(T[] money) {
		for(T m: money) {
			System.out.print(m + " ");
		}
		System.out.println();
	}
	
	public void depositemoney2(T[] money) {
		for(T m: money) {
			System.out.print(m + " ");
		}
		System.out.println();
	}
	
}

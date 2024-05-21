package com.umiitkose.creational.singleton.designpattern.enumS;

public class SingletonClient {
	public static void main(String[] args) {
		Singleton singleton = Singleton.UNIQUE_INSTANCE;
		System.out.println(singleton.getDescription());
	}
}

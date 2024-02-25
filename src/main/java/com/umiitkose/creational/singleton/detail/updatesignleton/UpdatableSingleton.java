
package com.umiitkose.creational.singleton.detail.updatesignleton;

import java.util.HashMap;
import java.util.Map;

public class UpdatableSingleton {
	private static UpdatableSingleton updatableSingleton = new UpdatableSingleton();
	
	private Map<String, Integer> products = new HashMap<String, Integer>();
	
	private UpdatableSingleton(){
		products.put("Book", 20);
		products.put("Pen", 5);
		products.put("Notebook", 9);
	}
	
	public static UpdatableSingleton getInstance(){
		return updatableSingleton;
	}
	
	public synchronized void updateProduct(String threadName, String name, Integer price) throws InterruptedException{
		System.out.println(threadName + " ==> Price for " + name + " before update: " + getPrice(name));
		Thread.sleep(100);
		products.put(name, price);
		System.out.println(threadName + " ==> Price for " + name + " after update: " + getPrice(name));
	}
	
	private int getPrice(String name){
		return products.get(name);
	}
}

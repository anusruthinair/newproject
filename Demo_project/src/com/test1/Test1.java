package com.test1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test1 {
	int x=10;
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start");
		Test1 t=new Test1();
		System.out.println(t.x);
		t=null;
		
		System.gc();
		
		System.out.println("main end");
	}
	protected void finalize()
	{
		System.out.println("object destroyed");
	}
}

package com.ds;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Logger;

public class ArrayNonRepeitiveNumber {
	
	static{
		String s = null;
		s.length();
		
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws CloneNotSupportedException {
		
		int[] arr = {1,2,3,4,2,5,3,6};
		HashSet intSet = new HashSet<>();
		
		for(int i =0; i<arr.length; i++){
			
			if(!intSet.contains(arr[i])){
				
				intSet.add(arr[i]);
			}else{
				
				intSet.remove(arr[i]);
			}
		}
		
		System.out.println(intSet);
		MyClass class1 =  new MyClass();
		
		ArrayNonRepeitiveNumber arrayNonRepeitiveNumber = new ArrayNonRepeitiveNumber();
		//arrayNonRepeitiveNumber.clone();
		
		try {
			//printClassLoaders();
			String s = null;
			s.length();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println("Inside catch of null pointer");
			e.printStackTrace();
		}
		
	}
	
	public static class MyClass{
		
		public static void displayOutput() {
		     System.out.println("Hot Tea says: ");
		   }
	}
	
	public static void  printClassLoaders() throws ClassNotFoundException {
		 
	    System.out.println("Classloader of this class:"
	        + ArrayNonRepeitiveNumber.class.getClassLoader());
	 
	    System.out.println("Classloader of Logging:"
	        + Logger.class.getClassLoader());
	 
	    System.out.println("Classloader of ArrayList:"
	        + ArrayList.class.getClassLoader());
	}
	
}

package com.ds;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class FinalClassExample {

	private final Integer id;

	private final String name;

	private final Date date;
	

	public FinalClassExample(Integer id, String name, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.date = new Date(date.getTime());
	}


	public Integer getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public Date getDate() {
		return new Date(this.date.getTime());
	}
	

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Date d = new Date();
		String s = "original";
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "Sony");
		map.put(2, "Sing");
		map.put(3, "Tip");

		Integer i = new Integer(10);

		FinalClassExample ce = new FinalClassExample(i, s, d);

		// Lets see whether its copy by field or reference
		System.out.println(s == ce.getName());
		System.out.println(d == ce.getDate());
		
		
		// print the ce values
		System.out.println("ce id:" + ce.getId());
		System.out.println("ce name:" + ce.getName());
		System.out.println("ce date:" + ce.getDate());
		
		// change the local variable values
		i =  new Integer(20);
		s = "modified";
		d.setMonth(2);
		// print the values again
		System.out.println("ce id after local variable change:" + ce.getId());
		System.out.println("ce name after local variable change:" + ce.getName());
		System.out.println("ce date after local variable change:" + ce.getDate());

		ce.getDate().setYear(1985);

	//	System.out.println(d == d1);
		System.out.println("ce date after changing variable from accessor methods:" + ce.getDate());
		
	}
}

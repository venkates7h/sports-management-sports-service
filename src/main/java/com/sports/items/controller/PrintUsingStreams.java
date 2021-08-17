package com.sports.items.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrintUsingStreams {
	
	
	
	public static void main(String... args) {
		List<String> cityList = new ArrayList<String>();
		cityList.add("hyderabad");
		cityList.add("banglore");
		cityList.add("chennai");
		cityList.add("mumabi");
		cityList.add("kolkata");
		cityList.add("delhi");
		
		//cityList.stream().forEach(s->System.out.println(s));
		//cityList.stream().forEach(System.out::println);
		//System.out.println(cityList.stream().collect(Collectors.toList()));
		cityList.stream().peek(s->System.out.println(s)).count();
	}

}

package com.string.logical.malli;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountDuplicateWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="all the best and best wishes to the people";
		
		Map<String, Long> map=Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		map.forEach((string,count)->{
			if(count>1) {
				System.out.println("word "+string+"duplicate "+count+"times");
			}
		});

	}

}

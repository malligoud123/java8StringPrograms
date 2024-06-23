package com.string.logical.malli;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurancesOfEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="mallikarjuna";
		Map<Character, Long> map=name.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		map.forEach((character,count)->System.out.println("character"+character+"count"+count));
		
		
		Map<Character, Long> map1=name.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()));
		System.out.println(map1.entrySet().stream()
				.filter(entry->entry.getValue()==1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList()));
		System.out.println(map1);
	}

}

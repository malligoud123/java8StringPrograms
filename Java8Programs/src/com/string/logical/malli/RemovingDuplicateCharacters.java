package com.string.logical.malli;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemovingDuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "mallikarjuna";

		String output = Arrays.asList(s.split("")).stream().distinct().collect(Collectors.joining());

		System.out.println(output);

		System.out.println("Repeated characters count");
		Map<Character, Long> map = s.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		//System.out.println(map);
		map.forEach((character, count) -> {
			if (count > 1) {
				System.out.println("character " + character + " repeate " + count + " times");
			}
		});
		System.out.println("occurances of each characters in java");

		Map<Character, Long> map1 = s.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		map1.forEach((character, count) -> System.out.println("character " + character + "=" + count));
	}

}

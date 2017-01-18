package com.chentianran;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Tianran on 1/18/2017.
 */
public class LongestSubstringNonRepeatingCharacter {
	public int longest(String input) {
		if(input == null || input.length() == 0) {
			return 0;
		}
		Set<Character> set = new HashSet<>();
		int result = 0;
		int slow = 0;
		int fast = 0;
		while (fast < input.length()) {
			if(set.contains(input.charAt(fast))) {
				set.remove(input.charAt(slow++));
			} else {
				set.add(input.charAt(fast++));
				result = Math.max(result, fast - slow);
			}
		}
		return result;
	}
}

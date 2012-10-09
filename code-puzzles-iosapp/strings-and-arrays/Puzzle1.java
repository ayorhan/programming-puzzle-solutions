/**
 * @author Arda Yigithan Orhan <ayorhan@ayorhan.com>
 * @version 1.0
 * @since 2012-10-09
 **/

import java.util.HashMap;
public class Puzzle1{
    
    public static void main(String[] args){
		
	long startTime, endTime, duration = 0, total = 0;
	String[] testCases = {null, "", "a", "aa", "aba", "bab", "test", "okay", "qwertyuiop[]asdfghjkl;'zxcvbnm,./"};
	int [] durations = new int [testCases.length];

	for (String test : testCases){
	    
	    startTime = System.nanoTime();
	    boolean unique = isUnique(test);
	    endTime = System.nanoTime();

	    duration = endTime - startTime;
	    System.out.println(test + "\t isUnique: " + unique + " \t took " + duration);
	    total += duration;
	}

	System.out.println("Average execution time: " + total/testCases.length);
	
	
    }

    
    /**
     * Checks if all characters in a given string are unique
     *
     * Time complexity ~ Quadratic Time O(n^2)
     * Space complexity ~ Constant Space
     *
     * @param str given string
     * @return if unique or not
     **/
    public static boolean isUnique(String str){
	
	if(str == null)
	    return false;

	int length = str.length(); // O(1) a micro optimization, calculate the length only once
	
	for(int i=0; i<length; i++){ // O(n)
	    if(str.indexOf(str.charAt(i), i+1) != -1) // indexOf uses a basic loop so O(n-k) ~ O(n)
		return false; 
	}

	return true;
	
    }

    /**
     * Checks if all characters in a given string are unique
     *
     * Time complexity ~ Linear Time O(n)
     * Space complexity ~ Linear Space
     *
     * @param str given string
     * @return if unique or not
     **/
    public static boolean isUnique2(String str){ 
	int length = str.length(); // O(1) a micro optimization, calculate the length only once

	HashMap<Character, Boolean> met = new HashMap<Character, Boolean>();

	for(int i=0; i<length; i++){ // O(n)
	    char c = str.charAt(i); // O(1) optimization
	    if(met.containsKey(c)) // O(k), constant time, k represents the collision handling
		return false;

	    met.put(c, null); // O(k), constant time, k represents the collision handling
	}

	return true;

    }

    


} 
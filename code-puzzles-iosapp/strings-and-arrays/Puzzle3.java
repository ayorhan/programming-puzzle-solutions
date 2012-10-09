/**
 * @author Arda Yigithan Orhan <ayorhan@ayorhan.com>
 * @version 1.0
 * @since 2012-10-09
 **/

public class Puzzle3{
    
    public static void main(String[] args){
		
	long startTime, endTime, duration = 0, total = 0;
	String[] testCases = {"", "a", "aa", "aba", "bab", "test", "okay", "qwertyuiop[]asdfghjkl;'zxcvbnm,./"};
	int [] durations = new int [testCases.length];

	for (String test : testCases){
	    
	    startTime = System.nanoTime();
	    boolean palindrome = isPalindrome(test);
	    endTime = System.nanoTime();

	    duration = endTime - startTime;
	    System.out.println(test + "\t isPalindrome: " + palindrome + " \t took " + duration);
	    total += duration;
	}

	System.out.println("Average execution time: " + total/testCases.length);
	
	
    }

    
    /**
     * Checks if a given string is a palindrome
     *
     * <p>Time complexity O(n) linear time
     * <p>Space complexity O(1) constant space
     *
     * @param str given string
     * @return if palindrome or not
     **/
    public static boolean isPalindrome(String str){
	
	int length = str.length()/2; // O(1) a micro optimization, calculate the length only once
	int halfLength = length/2; // O(1) a micro optimization, halve the length only once
       
	for(int i=0; i<halfLength; i++){ // O(n/2) ~ as n goes infitiniy, it becomes O(n) linear time  
	    if(str.charAt(i) != str.charAt(length-1-i)) // chartAt constant time
		return false; 
	}

	return true;
	
    }

   

    


} 
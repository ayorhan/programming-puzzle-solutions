/**
 * @author Arda Yigithan Orhan <ayorhan@ayorhan.com>
 * @version 1.0
 * @since 2012-10-09
 **/

public class Puzzle3{
    
    public static void main(String[] args){
		
	long startTime, endTime, duration = 0, total = 0;
	String[] testCases = {null, "", "a", "aa", "aba", "bab", "test", "okay", "qwertyuiop[]asdfghjkl;'zxcvbnm,./",
			      "A man, a plan, a canal, Panama",
			      "Go hang a salami. I'm a lasagna hog.",
			      "Madam I'm Adam."};
	int [] durations = new int [testCases.length];

	for (String test : testCases){
	    
	    startTime = System.nanoTime();
	    boolean palindrome = isPalindrome2(test);
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

	if(str == null)
	    return false;
	
	str = str.replaceAll("\\W", "");// clear punctuation
	str = str.toLowerCase(); // lower case

	int length = str.length(); // O(1) a micro optimization, calculate the length only once
	int halfLength = length/2; // O(1) a micro optimization, halve the length only once
	int endIndex = length-1;

	for(int i=0; i<halfLength; i++){ // O(n/2) ~ as n goes infitiniy, it becomes O(n) linear time  
	    if(str.charAt(i) != str.charAt(endIndex-i)) // chartAt constant time
		return false; 
	}

	return true;
	
    }

    /**
     * Checks if a given string is a palindrome in a recursive way
     *
     * <p>Time complexity O(n) linear time
     * <p>Space complexity O(1) constant space
     *
     * @param str given string
     * @return if palindrome or not
     **/
    public static boolean isPalindrome2(String str){

	if(str == null)
	    return false;
	
	str = str.replaceAll("\\W", "");// clear punctuation
	str = str.toLowerCase(); // lower case

	return isPalindrome2(str, 0, str.length()-1);
    }

    /**
     * Helper method that implements the recursive solution
     *
     * <p>Time complexity O(n) linear time
     * <p>Space complexity O(1) constant space
     *
     * @param str given string
     * @param startIndex
     * @param endIndex
     * @return if palindrome or not
     **/
    public static boolean isPalindrome2(String str, int startIndex, int endIndex){
	
	// Base Cases
	if(startIndex >= endIndex) //constant time
	    return true;
	
	if(str.charAt(startIndex) != str.charAt(endIndex)) //constant time
	    return false;

	// Recursive Case
	return isPalindrome2(str, startIndex+1, endIndex-1); // O(n/2) -> O(n) linear time 
    }

} 
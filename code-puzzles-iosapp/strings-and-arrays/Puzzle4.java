/**
 * @author Arda Yigithan Orhan <ayorhan@ayorhan.com>
 * @version 1.0
 * @since 2012-10-09
 **/

import java.util.HashMap;
public class Puzzle4{
    
    public static void main(String[] args){
		
	long startTime, endTime, duration = 0, total = 0;
	String[] testCases = {null, "", "", "", "This is it", "tisisiht", "echo", "oche", 
			      "wqdwqdwqds", "wwwsqdqqdd"};
			      
	int [] durations = new int [testCases.length];
	    
	for(int i=0; i<testCases.length; i+=2){

	    startTime = System.nanoTime();
	    boolean permutated = isPermutated(testCases[i], testCases[i+1]);
	    endTime = System.nanoTime();

	    duration = endTime - startTime;
	    System.out.println("Are " + testCases[i] + " and " + testCases[i+1] + " permutated? " + permutated + " took:" +  duration);
	    total += duration;
	}
       
    }

    
    /**
     * Checks if two strings are permutations of one another
     *
     * Time complexity ~ O(n) linear time 
     * Space complexity ~ linear space
     *
     * @param s1 given string1 
     * @param s2 given string2
     * @return if string 1 is permutation of string 2 or not
     **/
    public static boolean isPermutated(String s1, String s2){
	
	if(s1 == null || s2 == null)
	    return false;

	s1 = s1.toLowerCase();
	s2 = s2.toLowerCase();
	s1 = s1.replaceAll("\\W", "");
	s2 = s2.replaceAll("\\W", "");

	int s1Len = s1.length();
	int s2Len = s2.length();
	
	if(s1Len != s2Len)
	    return false;
	
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();

	for(int i=0; i<s1Len; i++){ // O(n) where n is the length of the string, linear time
	    if(map.containsKey(s1.charAt(i)))
		map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
	    else
		map.put(s1.charAt(i), new Integer(1));
	}

	for(int j=0; j<s2Len; j++){ // O(m) where m is the length of the string 2, linear time
	    if(map.containsKey(s2.charAt(j))){
		if(map.get(s2.charAt(j)) == 0)
		    return false;
		else
		    map.put(s2.charAt(j), map.get(s2.charAt(j))-1);
	    } else
		return false;
	}

	return true;

	
    }
    
    


} 
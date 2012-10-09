/**
 * @author Arda Yigithan Orhan <ayorhan@ayorhan.com>
 * @version 1.0
 * @since 2012-10-09
 **/

import java.util.HashMap;
public class Puzzle5{
    
    public static void main(String[] args){
		
	long startTime, endTime, duration = 0, total = 0;
	String[] testCases = {null, "","aabbbbcccddddd", "abcd", "ed  de de", "dddd"};
			      
	int [] durations = new int [testCases.length];
	    
	for(String test : testCases){

	    startTime = System.nanoTime();
	    String compressed = compress(test);
	    endTime = System.nanoTime();

	    duration = endTime - startTime;
	    System.out.println(test + " compressed to " + compressed + "  took:" +  duration);
	    total += duration;
	}
       
    }

    
    /**
     * Compresses strings following this rule:
     * <p> replace every group of char repeating more than one time with {char}{times}
     *
     * Time complexity ~ linear time
     * Space complexity ~ constant space
     *
     * @param str given string 
     * 
     * @return compressed form of the string
     **/
    public static String compress(String str){
	
	if(str == null || str.length() == 0) //constant time
	    return str;

	int strLen = str.length();
	int repeated = 0;
	StringBuilder output = new StringBuilder();

	for(int i=0; i<strLen; ){ // O(n) where n is the length of the string, linear time
	    char current = str.charAt(i);
	    output.append(current);

	    repeated = 1;
	  
	    while(i++ < strLen-1 && current == str.charAt(i)) // loop continues here, so still linear
		repeated++;
		
	    

	    if(repeated > 1)	
		output.append(repeated);

	    
	}

	return output.toString();

	
    }
    
    


} 
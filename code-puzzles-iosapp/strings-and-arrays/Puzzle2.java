/**
 * @author Arda Yigithan Orhan <ayorhan@ayorhan.com>
 * @version 1.0
 * @since 2012-10-09
 **/

import java.util.HashMap;
import java.util.Iterator;

public class Puzzle2{
    
    public static void main(String[] args){
		
	long startTime, endTime, duration = 0, total = 0;
	String[] testCases = {"", "a", "aa", "aba", "bab", "test", "okay", "qwertyuiop[]asdfghjkl;'zxcvbnm,./",
			      "", "a", "aa", "aba", "bab", "test", "okay", "qwertyuiop[]asdfghjkl;'zxcvbnm,./"};
	int [] durations = new int [testCases.length];
	    
	startTime = System.nanoTime();
	HashMap<String, Integer> map = count(testCases);
	endTime = System.nanoTime();

	duration = endTime - startTime;
	printHashMap(map);
	System.out.println("took " + duration);
	total += duration;
       
    }

    
    /**
     * Counts the number of times each word appears in a given array
     *
     * Time complexity ~ O(n) linear time 
     * Space complexity ~ linear space - allocated space for hashmap
     *
     * @param words given array
     * @return hashmap showing the number of times each word appears in the given array
     **/
    public static HashMap<String, Integer> count(String[] words){
	
	HashMap<String, Integer> countMap = new HashMap<String, Integer>(); // O(1) constant time
	
	for(String word : words){ // O(n) linear time, n is the length of the array
	    if(countMap.containsKey(word)) 
		countMap.put(word, countMap.get(word) + 1); // hashmap insert and find, both constant time
	    else
		countMap.put(word, new Integer(1)); // hashmap insert, constant time
							   
	}

	return countMap;
	
    }
    
    /**
     * Prints out the key and value pairs in a given hash map
     *
     * @param map given hash map
     *
     **/

    public static void printHashMap(HashMap map){

	Iterator iterator = map.keySet().iterator();

	while(iterator.hasNext()){
	    String key = iterator.next().toString();
	    String value = map.get(key).toString();
	    
	    System.out.println(key + " " + value);
	}
    }

    

    


} 
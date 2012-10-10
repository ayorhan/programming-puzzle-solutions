/**
 * @author Arda Yigithan Orhan <ayorhan@ayorhan.com>
 * @version 1.0
 * @since 2012-10-10
 **/

import java.util.HashMap;
import java.util.Arrays;

public class Puzzle1{
    
    public static void main(String[] args){
		
	long startTime, endTime, duration = 0, total = 0;
	int [][] numberArrays ={ {-3, 5, -5, 0},
				 {1, 1, 1, 1, -1, -1},
				 {2, 3, -1, 0, 0}};
	int [] durations = new int [numberArrays.length];
	
	for(int target = 0; target<3; target++){
	    System.out.println("Target: " + target);
	    for(int[] numberArray : numberArrays){
	    
		printArray(numberArray);
		System.out.print("=>");
		startTime = System.nanoTime();
		printPairs(numberArray, target);
		endTime = System.nanoTime();

		duration = endTime - startTime;
		System.out.println(" Took:" +  duration);
		total += duration;
	    }
	}
       
    }

    
    /**
     * Prints out all number pairs in an array whose sum matches a given number
     *
     * Time complexity ~ Linear O(n)
     * Space complexity ~ Linear  
     *
     * @param numbers array containing numbers
     * @param sum target value
     * 
     **/
    public static void printPairs(int [] numbers, int sum){
	HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();//linear space
	int length = numbers.length;

	System.out.print("[");
	for(int number : numbers){ //linear time
	    if(map.containsKey(sum - number)){ 
		if(!map.get(sum-number)){//found a pair
		    System.out.print("("+ number + "," + (sum-number) + ")");
		    map.put(sum-number, true);
		}
	    } else { //new
		map.put(number, false);
	    }
	}
	System.out.print("]");
	
    }
    
    /**
     * Prints out all number pairs in an array whose sum matches a given number
     *
     * Time complexity ~ 
     * Space complexity ~ 
     *
     * @param numbers array containing numbers
     * @param sum target value
     * 
     **/
    public static void printPairs2(int [] numbers, int sum){
	int length = numbers.length;
	Arrays.sort(numbers); // O(nlog(n))
	System.out.print("[");
	int firstIndex=0, lastIndex=length-1;

	while(firstIndex < lastIndex){
	    int currentSum = numbers[firstIndex] + numbers[lastIndex];

	    if(currentSum ==  sum){
		System.out.print("(" + numbers[firstIndex] + "," + numbers[lastIndex] + ")");
		
		lastIndex--;
		firstIndex++;

		while(numbers[lastIndex+1] == numbers[lastIndex] && lastIndex >= 0)
		    lastIndex--;

		while(numbers[firstIndex-1] == numbers[firstIndex] && firstIndex < length-1)
		    firstIndex++;
		
		
	    }
	    else if(currentSum > sum)
		lastIndex--;

	    else
		firstIndex++;
	}

	System.out.print("]");
	
    }

    


    public static void printArray(int [] array){
	System.out.print("[");
	int length = array.length;
	for(int i=0; i<length; i++){
	    if(i == length-1)
		System.out.print(array[i]);
	    else
		System.out.print(array[i] + ",");
	}
	System.out.print("]");
    }
   
    
    


} 
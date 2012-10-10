/**
 * @author Arda Yigithan Orhan <ayorhan@ayorhan.com>
 * @version 1.0
 * @since 2012-10-10
 **/

public class Puzzle2{
    
    public static void main(String[] args){
		
	long startTime, endTime, duration = 0, total = 0;
	int [][] numberArrays ={ {-3, 5, -5, 0},
				 {1, 1, 1, 1, -1, -1},
				 {2, 3, -1, 0, 0},
				 {-1, 3, 1, -5, 4, 1, -7}};
	int [] durations = new int [numberArrays.length];
	
	
	
	for(int[] numberArray : numberArrays){
	    
	    printArray(numberArray);
	    System.out.print("=>");
	    startTime = System.nanoTime();
	    largestSum(numberArray);
	    endTime = System.nanoTime();

	    duration = endTime - startTime;
	    System.out.println(" Took:" +  duration);
	    total += duration;
	}
	
       
    }

    
    /**
     * Computes the largest sum of contiguous elements in a given array
     *
     * Time complexity ~ 
     * Space complexity ~  
     *
     * @param numbers array containing numbers
     * 
     **/
    public static void largestSum(int [] numbers){
	
	int length = numbers.length - 1;
	int largestSum = Integer.MIN_VALUE;

	for(int i=0; i<length; i++) //linear time
	    if(numbers[i] + numbers[i+1] > largestSum)
		largestSum = numbers[i] + numbers[i+1];
	
	System.out.print("largestSum: " + largestSum);
	
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
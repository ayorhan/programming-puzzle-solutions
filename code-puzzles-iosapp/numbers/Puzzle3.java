/**
 * @author Arda Yigithan Orhan <ayorhan@ayorhan.com>
 * @version 1.0
 * @since 2012-10-10
 **/

public class Puzzle3{
    
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
	    swap(numberArray, 0, numberArray.length-1);
	    endTime = System.nanoTime();
	    printArray(numberArray);

	    duration = endTime - startTime;
	    System.out.println(" Took:" +  duration);
	    total += duration;
	}
	
       
    }

    
    /**
     * Swaps two elements in an array without actually swapping values
     *
     * Time complexity ~ 
     * Space complexity ~  
     *
     * @param numbers array containing numbers
     * @param i index of first element
     * @param j index of second element
     * 
     **/
    public static void swap(int [] numbers, int i, int j){
	
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
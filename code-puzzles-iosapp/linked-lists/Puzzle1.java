/**
 * @author Arda Yigithan Orhan <ayorhan@ayorhan.com>
 * @version 1.0
 * @since 2012-10-10
 **/

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
     * Returns the reverse of a given linked list
     *
     * Time complexity ~ 
     * Space complexity ~   
     *
     * @param head given linked list
     * 
     **/

    public static Node reverse(Node head){
	if(head == null)
	    return head;

	return reverse(head.next)
		
    
}
    /**
     * Returns the reverse of a given linked list in a recursive way
     *
     * Time complexity ~ 
     * Space complexity ~   
     *
     * @param head given linked list
     * 
     **/

    public static Node reverse2(Node head){
	if(head == null)
	    return head;

	return reverse(head.next)
		
    }
    
    public static class Node {
	char data;
	Node next;
    }
   
    public static void printLinkedList(Node head){
	System.out.print("[");
	while(head != null){
	    if(i == length-1)
		System.out.print(head.data);
	    else
		System.out.print(head.data + "->");
	    head = head.next;
	}
	System.out.print("]");
    }
} 
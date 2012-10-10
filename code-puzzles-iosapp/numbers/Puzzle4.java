/**
 * @author Arda Yigithan Orhan <ayorhan@ayorhan.com>
 * @version 1.0
 * @since 2012-10-10
 **/

public class Puzzle4{
    
    public static void main(String[] args){
		
	long startTime, endTime, duration = 0, total = 0;
	String [] binaries = {"10101", "1", "0", "111", "11", "10"};

	int [] durations = new int [binaries.length];
		
	for(String binary : binaries){
	    
	    startTime = System.nanoTime();
	    int decimal = toDecimal(binary);
	    endTime = System.nanoTime();
	    
	    duration = endTime - startTime;
	    System.out.println("Binary: " + binary + " toDecimal: " + decimal +" took:" +  duration);
	    total += duration;
	}
    }

    /**
     * Converts a binary number to a decimal number
     *
     * Time complexity ~ Linear
     * Space complexity ~ Constant 
     *
     * @param binary given binary number as a string
     * 
     **/
    public static int toDecimal(String binary){
	int length = binary.length()-1;
	int decimal = 0;
	for(int i=length; i>=0; i--){
	    int val = binary.charAt(i) - '0';
	    decimal += val * Math.pow(2,i);
	}

	return decimal;
    }
} 
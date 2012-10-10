/**
 * @author Arda Yigithan Orhan <ayorhan@ayorhan.com>
 * @version 1.0
 * @since 2012-10-10
 **/

public class Puzzle5{
    
    public static void main(String[] args){
		
	long startTime, endTime, duration = 0, total = 0;
	int [] decimals = {0,1,2,3,4,5,6,7,8};

	int [] durations = new int [decimals.length];
		
	for(int decimal : decimals){
	    
	    startTime = System.nanoTime();
	    String binary = toBinary2(decimal);
	    endTime = System.nanoTime();
	    
	    duration = endTime - startTime;
	    System.out.println("ToBinary: " + binary + " Decimal: " + decimal +" took:" +  duration);
	    total += duration;
	}
    }

    /**
     * Converts a decimal number to a binary number 
     *
     * Time complexity ~ Logaritmic O(log(n))
     * Space complexity ~ Constant 
     *
     * @param decimal given decimal as an int
     * 
     **/
    public static String toBinary(int decimal){
	if(decimal == 0)
	    return "0";
	
	StringBuilder binary = new StringBuilder();
	
	while(decimal > 0){
	    binary.append(decimal%2);
	    decimal = decimal/2;
	}

	return binary.reverse().toString();
    }

    
    /**
     * Converts a decimal number to a binary number in a recursive way 
     *
     * Time complexity ~ 
     * Space complexity ~ 
     *
     * @param decimal given decimal as an int
     * 
     **/
    public static String toBinary2(int decimal){
	if(decimal == 0)//Base Case - if decimal reaches to 0, stop.
	    return "0";
	
	// Recursive Case
	return toBinary2(decimal/2) + (decimal % 2);
    }
} 
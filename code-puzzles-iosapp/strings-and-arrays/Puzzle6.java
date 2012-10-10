/**
 * @author Arda Yigithan Orhan <ayorhan@ayorhan.com>
 * @version 1.0
 * @since 2012-10-09
 **/

public class Puzzle6{
    
    public static void main(String[] args){
		
	long startTime, endTime, duration = 0, total = 0;
	int [][] decks ={ {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {3, 53, 3, 5}};
	int [] durations = new int [decks.length];
	    
	for(int[] deck : decks){
	    String pre = printDeck(deck);

	    startTime = System.nanoTime();
	    shuffle2(deck);
	    endTime = System.nanoTime();

	    duration = endTime - startTime;
	    System.out.println("Deck: " + pre + "  took:" +  duration);
	    total += duration;
	}
       
    }

    
    /**
     * Randomly shuffles a deck of cards
     *
     * Time complexity ~ Quadratic O(n^2) 
     * Space complexity ~ Linear  
     *
     * @param card array of ints representing a deck of cards 
     * 
     **/
    public static void shuffle(int [] cards){

	int deckLen = cards.length;
	int [] shuffled = new int[deckLen]; // linear space
	int index = 0;
	for(int card : cards){ // linear time O(n), where n is the length of the deck
	    int newPosition = (int)(Math.random() * deckLen);
	    // worst case linear time O(m), 
	    // where m is the length of the new deck
	    while(shuffled[newPosition] != 0){ //collision handling
		newPosition++;
		if(newPosition == deckLen)
		    newPosition = 0;
	    }

	    shuffled[newPosition] = cards[index];
	    index++;
	    
	}

	System.out.print("Shuffled: " + printDeck(shuffled) + " ");
    }

    /**
     * Randomly shuffles a deck of cards by swapping
     *
     * Time complexity ~ Linear
     * Space complexity ~ Constant  
     *
     * @param card array of ints representing a deck of cards 
     * 
     **/
    public static void shuffle2(int [] cards){

	int deckLen = cards.length;
	int index = 0;
	for(int card : cards){ // linear time O(n), where n is the length of the deck
	    int newPosition = (int)(Math.random() * deckLen);
	    
	    // Swapping constant time
	    int temp = cards[index];
	    cards[index] = cards[newPosition];
	    cards[newPosition] = temp;
	    index++;
	}

	System.out.print("Shuffled: " + printDeck(cards) + " ");
    }


    public static String printDeck(int [] deck){
	int len = deck.length;
	StringBuilder out = new StringBuilder();
	out.append("[");
	for(int i=0; i<len; i++){
	    if(i != len-1)
		out.append(deck[i] + ",");
	    else
		out.append(deck[i]);
	}
	out.append("]");
	return out.toString();
    }
    
    


} 
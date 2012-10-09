/**
 * @author Arda Yigithan Orhan <ayorhan@ayorhan.com>
 * @version 1.0
 * @since 2012-10-09
 **/

public class Puzzle6{
    
    public static void main(String[] args){
		
	long startTime, endTime, duration = 0, total = 0;
	int [][] decks ={ {1, 2, 3, 4}, {3, 53, 3, 5}};
			      
	int [] durations = new int [decks.length];
	    
	for(int[] deck : decks){
	    String pre = printDeck(deck);

	    startTime = System.nanoTime();
	    shuffle(deck);
	    endTime = System.nanoTime();

	    duration = endTime - startTime;
	    System.out.println(pre + " shuffled to " + printDeck(deck) + "  took:" +  duration);
	    total += duration;
	}
       
    }

    
    /**
     * Randomly shuffles a deck of cards
     *
     * Time complexity ~ 
     * Space complexity ~ 
     *
     * @param card array of ints representing a deck of cards 
     * 
     **/
    public static void shuffle(int [] cards){

	int deckLen = cards.length;
	int [] shuffled = new int[deckLen];
	int index = 0;
	for(int card : cards){
	    int newPosition = (int)(Math.random() * deckLen);
	    while(shuffled[newPosition] != 0)
		newPosition = (int)(Math.random() * deckLen);

	    shuffled[newPosition] = cards[index];
	    index++;
	    
	}

	cards = shuffled;
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
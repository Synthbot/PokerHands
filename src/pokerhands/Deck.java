package pokerhands;
import java.util.Random;
import java.util.ArrayList;

public class Deck {
	
	private ArrayList<Cards> Deck;
	private int cardsUsed;
	
	Deck()
	{
		Deck = new ArrayList<Cards>();
		
		int cardcounter = 0;
		
		for (int suit = 0; suit<= 3; suit++)
		{
			for (int face=2; face<=14; face++)
			{
				Deck.add( new Cards (suit,face) );
				cardcounter++;
			}
		}
		
		//int size = Deck.size() -1;
		
		Random generator = new Random();
		int shuffle1, shuffle2; 
		Cards temp;
		
		for (int i=0; i<75; i++)//Deck Shuffling
		{
			shuffle1 =generator.nextInt(Deck.size() - 1);
			shuffle2 =generator.nextInt(Deck.size() - 1);
			
			temp = Deck.get(shuffle2);
			Deck.set(shuffle2, Deck.get(shuffle1));
			Deck.set(shuffle1, temp);
		}
	}
	
    public Cards draw()
    {       
        return Deck.remove(0);
    }
	
}
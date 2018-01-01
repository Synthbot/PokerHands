package pokerhands;


public class Main {

	public static void main(String[] args)  {
	     for (int game=0; game<1; game++)
	     {
	         Deck deck= new Deck();
	         Hands hand= new Hands(deck);
	         Hands hand2= new Hands(deck);
	         
	         System.out.println("Player 1");
	         hand.displayHandType(); //shows hand type e.g. Flush"
	         hand.displayHand();          
	         
	         System.out.println("Player 2");
	         hand2.displayHandType();
	         hand2.displayHand();
	         

	         
	         //System.out.println(hand.compareTo(hand2));
	     }
	}
}
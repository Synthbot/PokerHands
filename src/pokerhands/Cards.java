package pokerhands;
import java.util.Random;
import java.util.ArrayList;

public class Cards {
	private final int rank, suit;
	//private int value;
	
	public static final int clubs = 0;
	public static final int diamonds = 1;
	public static final int hearts = 2;
	public static final int spades = 3;
	
	public static final int ten = 10;
	public static final int jack = 11;
	public static final int queen = 12;
	public static final int king = 13;
	public static final int ace = 14;
	
	public static final int joker = 15;
	
	
	Cards(int suitnum, int ranknum){
		if (suitnum != clubs && suitnum != diamonds && suitnum != hearts && suitnum != spades)
			throw new ArithmeticException ("Error: Impossilble Suit");
		if (ranknum <2 || ranknum > 14)
			throw new ArithmeticException ("Error: Impossilble Rank");
		rank = ranknum;
		suit = suitnum;
		}
	
	   public String getSuitAsString() {
		      switch ( suit ) {
		      case clubs:    return "C";
		      case diamonds: return "D";
		      case hearts:   return "H";
		      case spades:   return "S";
		      
		      default:       return "Joker";
		      }
	   }
	   
	   public String getRankAsString() {
		      if (suit == joker)
		         return "" + rank;
		      else {
		         switch ( rank ) {		        
		         case 2:   return "2";
		         case 3:   return "3";
		         case 4:   return "4";
		         case 5:   return "5";
		         case 6:   return "6";
		         case 7:   return "7";
		         case 8:   return "8";
		         case 9:   return "9";
		         case 10:  return "T";
		         case 11:  return "J";
		         case 12:  return "Q";
		         case 13:  return "K";
		         case 14:  return "A";
		         default:  return "Joker";
		         
		         }
		      }

	   }
	/*for (int s=0; s<=3; s++) {
		if suit==1
				
		for (int r=0; r<13; r++) {
			
		}
	}*/
	/*


        for (int r=0; r<=13; r++){
            if(cardsRank.equals(ranks[r])){
                this.rank = r;
            }
        }
        
        for (int s=0; s<=3; s++){
            if(cardsSuit.equals(suits[s])){
                this.suit = s;
            }
        }
	}*/
	
	
    public @Override String toString()
    {
          return getRankAsString() + "" + getSuitAsString();
    }
	public int getRank() {
		return rank; 
	}
	
	public int getSuit() {
		return suit; 
	}
	
}

	


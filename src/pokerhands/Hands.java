package pokerhands;
import java.util.Arrays;
import java.util.Collections;

public class Hands {
    private Cards[] card;

    private int[] value;
    
    
    Hands(Deck d)
    {
        value = new int[5];
        card = new Cards[5];
        for (int x=0; x<5; x++)
        {
            card[x] = d.draw(); 
        }
    }
   
    void displayHandType() /*Purpose: Sort then compare highest values to see where card can go
    *Default hand type will be High Card, as there will always be one
    */
    {
    	System.out.println("Hand Type: ");
    	
    	/*Arrays.sort(card); Not comparable, cannot be cast
    	 * Unable to sort to determine rankings due to time constraints
    	 * 
    	 * Might be possible get rank as string, then parse into value to get value or use split off of suit type
    	 */
    	
    	
    	
        for (int x=0; x<5; x++) {
            //System.out.print(card[x]+" "); //Used for testing
            //card[x]=value[x] //last card is highest E.G. Ace = 14
        }
        
        
        
        
        System.out.print("Please check Hands.Java, I was unable to get sorting operational but the logic is there.");
        System.out.println("");
    	
    	/*String handType; //Determining what to print back to the console based on ranked values
        switch( value[0] )
        
        //Upon further review, I could have put this all in one loop and if else'd everything out as needed for hand types
        {

            case 1:
            	for (int x=0;x<5;x++){
            		for(int y=1;y<5;y++){
            			for(int z=2;y<5;y++){
            				for(int f=3;f<5;f++){
            		
            					if ((value[x] - value [y] == 1 && value [z] - value [f] == 1)&&(card[x] && card [y] && card [z] && card [f] && card [g] == parseString("C","D","H","S")){
            						handType=("Straight Flush" + value[5]);
            					}
            				}
            			}	
            		}
            	}
            	
                break;
            case 2:
               	for (int x=0;x<5;x++){
            		for(int y=1;y<5;y++){
            			for(int z=2;y<5;y++){
            				for(int f=3;f<5;f++){
            		
            					if (value[x] == value [y] && value [x] == value [z] && value [x] == value [f] ){
            						handType=("Four of a Kind " + value[5]);
            					}
            				}
            			}
            		}
            	}
            	break;
            case 3:
            	for (int x=0;x<5;x++){
            		for(int y=1;y<5;y++){
            			for(int z=2;y<5;y++){
            				for(int f=3;f<5;f++){
            		
            					if ((value[x] == value [y] || value [z] == value [f]) && (value [x] == value [y] && value [x] == value[z])){
            						handType=("Full House" value[5]);
            					}
            				}
            			}	
            		}
            	}
                break;
            case 4:
               	for (int x=0;x<5;x++){
            		for(int y=1;y<5;y++){
            			for(int z=2;y<5;y++){
            				for(int f=3;f<5;f++){
            					for(int g=4;g<5;g++){
            		
            					if (card[x] && card [y] && card [z] && card [f] && card [g] == parseString("C","D","H","S"){
            						handType=("Flush " + value[5]);
            					}
            				}
            			}
            		}
            	}
            	break;
            case 5:
            	for (int x=0;x<5;x++){
            		for(int y=1;y<5;y++){
            			for(int z=2;y<5;y++){
            				for(int f=3;f<5;f++){
            		
            					if (value[x] - value [y] == 1 && value [z] - value [f] == 1){
            						handType=("Straight" + value[5]);
            					}
            				}
            			}	
            		}
            	}
            	
                break;
            case 6:
               	for (int x=0;x<5;x++){
            		for(int y=1;y<5;y++){
            			for(int z=2;y<5;y++){
            		
            				if (value[x] == value [y] && value [x] == value [z]){
            					handType=("Three of a Kind " + value[5]);
            					
            				}
            			}
            		}
            	}
            	break;
            case 7:
               	for (int x=0;x<5;x++){
            		for(int y=1;y<5;y++){
            			for(int z=2;y<5;y++){
            				for(int f=3;f<5;f++){
            		
            					if (value[x] == value [y] && value [z] == value [f]){
            						handType=("Two Pair of " + value[5]);
            					}
            				}
            			}	
            		}
            	}
            case 8:
               	for (int x=0;x<5;x++){
            		for(int y=1;y<4;y++){
            		
            			if (value[x] == value [y]){
            				handType=("Pair of " + value[5]);
            			}
            		}
            	}
                break;
            default:
                handType=("High Card" + value[5]);
        */
        //}
        //
        //System.out.print(handType);
    }
	
   

    void displayHand()
    {
        for (int x=0; x<5; x++)
            System.out.print(card[x]+" "); 
        
        System.out.println("");
    }
/*
    int compareTo(Hands that)
    {
        for (int x=0; x<5; x++) //cycle through values
        {
            if (this.value[x]>that.value[x])
                return 1;
            else if (this.value[x]<that.value[x])
                return -1;
        }
        return 0; //if hands are equal
    }*/
}

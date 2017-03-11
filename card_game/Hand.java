package card_game;
import java.util.*;

public class Hand {

 private ArrayList<Card> hand; 

 public Hand(){
  this.hand = new ArrayList<Card>();
 
  }

  public int cardCount(){
    return hand.size();
  }

  public void addCardToHand(Card card){
  hand.add(card);
  }

  public void discardHand(){
    hand.clear();
  }

  public String showHand(){
    String result = "";
    for(Card card : hand){
      result = result + card.showCard() + ", ";
    }
     return result;
   }

}


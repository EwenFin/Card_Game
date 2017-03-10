package card_game;
import java.util.*;

public class Deck {

 private ArrayList<Card> cards; 

 public Deck(){
  this.cards = new ArrayList<Card>();
 
  }

  public int cardCount(){
    return cards.size();
  }

  public void addCardToDeck(Card card){
  cards.add(card);
  }

  public void removeCardFromDeck(Card card){
  cards.remove(card);
  }

}
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

  public void shuffle(){
    Collections.shuffle(this.cards);
  }

  public void deal(Player player){
    Card card = cards.get(0);
    Hand hand = player.getHand();
    hand.addCardToHand(card);
    removeCardFromDeck(card);
  } 

  public void buildDeck(){
    for (Suit suit : Suit.values()) {
        for (Rank rank : Rank.values()) {
              cards.add(new Card(suit, rank));
            }
          }
        }
}
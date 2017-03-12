package card_game;
import java.util.*;

public class HighCard extends Deck{
  // public Deck deck;
  public ArrayList<Player> players;

  public HighCard(){
    // this.deck = deck;
    this.players = new ArrayList<Player>();
  }

  public int playerCount(){
    return players.size();
  }

  public void addPlayerToGame(Player player){
    players.add(player);
  }

  
  public void deal(){
    for(Player player : this.players){
      Card card = cards.get(cards.size() - 1);
      Hand hand = player.getHand();
      hand.addCardToHand(card);
      removeCardFromDeck(card);
    }
   }

  public String showHands(){
    String result = "";
      for (Player player : this.players){
        result = result + player.getName() + " has the " +player.getHand().showHand();
        
      } 
      return result;
  }
}




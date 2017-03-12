package card_game;
import java.util.*;

public class HighCard extends Deck{
  public ArrayList<Player> players;
  // public HashMap<String, Integer> winner; 

  public HighCard(){
    this.players = new ArrayList<Player>();
    // this.winner = new HashMap<String, Integer>();
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

  public String winner(Player player1, Player player2){
    int player1score = player1.getHand().handValue();
    int player2score = player2.getHand().handValue();
    if (player1score > player2score){
      return player1.getName() + " Wins!";
    }
    else if (player1score == player2score){
      return "It's a Draw!";
    }
    else{
      return player2.getName() + " Wins!";
    }
  }
}
  // public String winner(){
  //   for(Player player : this.players){
  //     winner.put(player.getName(), player.getHand().handValue());
  //   }
  //     Map sortedWinner = sortByValue(winner);


    // the plan was to add the players and handvalues into a Hashmap, sort the hashmap by value and then return the key with the highest value, but I'm a bit lost on the sorting.
     


  




package card_game;
import java.util.*;

public class SimpleBlackJack extends HighCard{
  public ArrayList<Player> players;

  public SimpleBlackJack(){
    this.players = new ArrayList<Player>();
  }

  public Integer getScore(Hand hand){
    ArrayList<Card> cards = hand.getHand();
    Integer score = 0;
    for(Card card : cards){
      if(card.cardValue() <= 10){
        score = score + card.cardValue();
      }
      else if(card.cardValue() >= 11 && card.cardValue() < 14){
        score = score + 10; 
      } 
      else if(card.cardValue() == 14){
        score = score + 11;
      }
 
    }
    return score;
  }


  @Override
  public String winner(Player player1, Player player2){
    Integer player1score = getScore(player1.getHand());
    Integer player2score = getScore(player2.getHand());
    if (player1score > player2score){
      return player1.getName() + " Wins with " +player1score.toString();
    }
    else if (player1score == player2score){
      return "It's a Draw on " + player1score.toString();
    }
    else{
      return player2.getName() + " Wins with " + player2score.toString();
    }


  }

    

  
}
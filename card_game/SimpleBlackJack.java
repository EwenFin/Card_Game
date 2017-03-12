package card_game;
import java.util.*;

public class SimpleBlackJack extends HighCard{
  public ArrayList<Player> players;

  public SimpleBlackJack(){
    this.players = new ArrayList<Player>();
  }


  @Override
  public String winner(Player player1, Player player2){
    Integer player1score = player1.getHand().handValue();
    Integer player2score = player2.getHand().handValue();
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
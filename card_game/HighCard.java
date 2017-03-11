package card_game;
import java.util.*;

public class HighCard {
  public Deck deck;
  public ArrayList<Player> players;

  public HighCard(){
    this.deck = deck;
    this.players = new ArrayList<Player>();
  }

  public int playerCount(){
    return players.size();
  }

  public void addPlayerToGame(Player player){
    players.add(player);
  }



}
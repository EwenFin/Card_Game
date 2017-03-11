import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;


public class HighCardTest{

  HighCard game;

   Deck deck;

  Player player1;
  Player player2;
  Player player3;

  Hand player1hand;
  Hand player2hand;
  Hand player3hand;

@Before
public void before(){
   deck = new Deck();
  player1hand = new Hand();
  player2hand = new Hand();
  player3hand = new Hand();
  player1 = new Player("Ewen", player1hand);
  player2 = new Player("Steven", player2hand);
  player3 = new Player("Oli", player3hand);
  game = new HighCard();

}

@Test
public void canAddPlayersToGame(){
  game.addPlayerToGame(player1);
  game.addPlayerToGame(player2);
  game.addPlayerToGame(player3);
  assertEquals(3, game.playerCount());

}

@Test
public void TestDeck(){
  assertEquals(52, game.cardCount());

}


@Test
public void canDealToPlayers(){
  game.addPlayerToGame(player1);
  game.addPlayerToGame(player2);
  game.addPlayerToGame(player3);
  
  } 
}
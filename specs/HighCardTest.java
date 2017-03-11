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

  Card card1;
  Card card2;
  Card card3;

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
   game.addPlayerToGame(player1);
   game.addPlayerToGame(player2);
   game.addPlayerToGame(player3);
   card1 = new Card(Suit.HEARTS, Rank.KING);
   card2 = new Card(Suit.DIAMONDS, Rank.JACK);
   card3 = new Card(Suit.SPADES, Rank.ACE);

 }

 @Test
 public void canAddPlayersToGame(){
  assertEquals(3, game.playerCount());

}

@Test
public void TestDeck(){
  assertEquals(52, game.cardCount());
}


@Test
public void canDealToPlayers(){
  game.deal();
  assertEquals(1, player1hand.cardCount());
  assertEquals(1, player2hand.cardCount());
  assertEquals(1, player3hand.cardCount());
    }
  
// @Test
// public void canShowHand(){
// player1hand.addCardToHand(card1);
// player2hand.addCardToHand(card2);
// player3hand.addCardToHand(card3);
// assertEquals("Ewen has the KING of HEARTS, Steven has the JACK of DIAMONDS, Oli has the ACE of SPADES",  game.showCards());






}

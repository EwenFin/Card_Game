import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;


public class SimpleBlackJackTest{

  SimpleBlackJack game;

  Player player1;
  Player player2;

  Hand player1hand;
  Hand player2hand;

  Card card1;
  Card card2;
  Card card3;
  Card card4;
  Card card5;
 


   @Before
   public void before(){
    player1hand = new Hand();
    player2hand = new Hand();
    player1 = new Player("Ewen", player1hand);
    player2 = new Player("Steven", player2hand);
    game = new SimpleBlackJack();
    game.addPlayerToGame(player1);
    game.addPlayerToGame(player2);
    card1 = new Card(Suit.HEARTS, Rank.KING);
    card2 = new Card(Suit.DIAMONDS, Rank.JACK);
    card3 = new Card(Suit.SPADES, Rank.ACE);
    card4 = new Card(Suit.CLUBS, Rank.FOUR);
    card5 = new Card(Suit.HEARTS, Rank.TEN);
    
    }


    @Test
    public void canDealToPlayers(){
      game.deal();
      game.deal();
      assertEquals(2, player1hand.cardCount());
      assertEquals(2, player2hand.cardCount());
    }

    @Test
    public void canShowHand(){
    player1hand.addCardToHand(card1);
    player1hand.addCardToHand(card4);
    player2hand.addCardToHand(card3);
    player2hand.addCardToHand(card2);
    assertEquals("Ewen has the KING of HEARTS, FOUR of CLUBS, Steven has the ACE of SPADES, JACK of DIAMONDS, ",  game.showHands());
        }

    @Test
    public void testWinner(){
      player1hand.addCardToHand(card1);
      player1hand.addCardToHand(card4);
      player2hand.addCardToHand(card3);
      player2hand.addCardToHand(card2);
      assertEquals("Steven Wins with 21", game.winner(player1, player2));
    }



  }

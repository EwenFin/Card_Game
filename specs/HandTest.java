import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class HandTest{

  Hand hand;

  Card card1;
  Card card2;
  Card card3;

  @Before
  public void before(){
    hand = new Hand();
    card1 = new Card(Suit.HEARTS, Rank.KING);
    card2 = new Card(Suit.DIAMONDS, Rank.JACK);
    card3 = new Card(Suit.SPADES, Rank.ACE);
  }

  @Test
  public void canAddCardToHand(){
    hand.addCardToHand(card1);
    assertEquals(1, hand.cardCount());
  }  
}
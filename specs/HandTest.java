import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class HandTest{

  Hand hand;

  Card card1;
  Card card2;
  

  @Before
  public void before(){
    hand = new Hand();
    card1 = new Card(Suit.HEARTS, Rank.KING);
    card2 = new Card(Suit.DIAMONDS, Rank.JACK);
      }

  @Test
  public void canAddCardToHand(){
    hand.addCardToHand(card1);
    assertEquals(1, hand.cardCount());
  }

  @Test
  public void canDiscard(){
    hand.addCardToHand(card1);
    hand.discardHand();
    assertEquals(0, hand.cardCount());
  }

  @Test
  public void canShowHand(){
    hand.addCardToHand(card1);
    hand.addCardToHand(card2);
    assertEquals("KING of HEARTS, JACK of DIAMONDS, ", hand.showHand());
  }

  @Test
  public void testHandValue(){
    hand.addCardToHand(card1);
    assertEquals(13, hand.handValue());
  }
  
}
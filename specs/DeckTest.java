import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class DeckTest{

  Deck deck;

  Hand hand;

  Card card1;
  Card card2;
  Card card3;

  @Before
  public void before(){
    deck = new Deck();
    hand = new Hand();
    card1 = new Card(Suit.HEARTS, Rank.KING);
    card2 = new Card(Suit.DIAMONDS, Rank.JACK);
    card3 = new Card(Suit.SPADES, Rank.ACE);
  }

  @Test
  public void canAddCardToDeck(){
    deck.addCardToDeck(card1);
    assertEquals(1, deck.cardCount());
  } 

  @Test
  public void canRemoveCardFromDeck(){
    deck.addCardToDeck(card1);
    deck.addCardToDeck(card2);
    assertEquals(2, deck.cardCount());
    deck.removeCardFromDeck(card1);
    assertEquals(1,deck.cardCount());
  } 

  @Test
  public void canDeal(){
    deck.addCardToDeck(card1);
    deck.addCardToDeck(card2);
    deck.addCardToDeck(card3);
    deck.deal(hand);
    assertEquals(1, hand.cardCount());
    assertEquals(2, deck.cardCount());

  }
}
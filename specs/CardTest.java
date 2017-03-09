import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class CardTest{

  Card card1;
  Card card2;
  Card card3;

  @Before
  public void before(){
    card1 = new Card(Suit.HEARTS, Rank.KING);
    card2 = new Card(Suit.DIAMONDS, Rank.JACK);
    card3 = new Card(Suit.SPADES, Rank.ACE);
  }

  @Test
  public void canGetSuit(){
    assertEquals(Suit.HEARTS, card1.getSuit());
    assertEquals(Suit.SPADES, card3.getSuit());
  }

  @Test
  public void canGetRank(){
    assertEquals(Rank.KING, card1.getRank());
    assertEquals(Rank.JACK, card2.getRank());
  }
}


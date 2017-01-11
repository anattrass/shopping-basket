import static org.junit.Assert.*;
import org.junit.*;
import Shopping.*;

public class BasketTest {
  Basket basket;

  @Before
  public void setup() {
    basket = new Basket();
  }

  @Test 
  public void testStartsEmpty() {
    assertEquals(basket.countItemsInBasket(), 0);
  }

}
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

  @Test
  public void testItemInBasket() {
    Item item = new Item("Coke", 0.80);
    basket.insert(item);
    assertEquals(basket.checkAddedItems().get(0).getItemName(), "Coke");
  }

}
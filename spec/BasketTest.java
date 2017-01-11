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
    Item item1 = new Item("Coke", 0.80);
    Item item2 = new Item("Milk", 1.00);
    basket.insert(item1);
    basket.insert(item2);
    assertEquals(basket.checkAddedItems().get(1).getItemName(), "Milk");
  }

  @Test
  public void testRemoveFirstItemFromBasket() {
    Item item1 = new Item("Coke", 0.80);
    Item item2 = new Item("Milk", 1.00);
    basket.insert(item1);
    basket.insert(item2);
    basket.removeFirstItem();
    assertEquals(basket.checkAddedItems().get(0).getItemName(), "Milk");
  }

  @Test
  public void testEmptyBasket() {
   Item item1 = new Item("Coke", 0.80);
   Item item2 = new Item("Milk", 1.00);
   basket.insert(item1);
   basket.insert(item2);
   basket.emptyBasket();
   assertEquals(basket.countItemsInBasket(), 0);
  }

  @Test
  public void testTotalBasketPrice() {
    Item item1 = new Item("Coke", 0.80);
    Item item2 = new Item("Milk", 1.00);
    basket.insert(item1);
    basket.insert(item2);
    assertEquals(basket.getTotal(), 1.80, 00.1);
  }

  @Test
  public void testTenPercentOff() {
    Item item1 = new Item("Champagne", 17.80);
    Item item2 = new Item("Block of Cheese", 3.00);
    basket.insert(item1);
    basket.insert(item2);
    assertEquals(basket.tenPercentOff(), 18.72, 00.1);
  }

}
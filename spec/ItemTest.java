import static org.junit.Assert.*;
import org.junit.*;
import Shopping.*;

public class ItemTest {
  Item item;

  @Before
  public void setup() {
    item = new Item("Milk", 1.00);
  }

  @Test
  public void testGetItemName() {
    assertEquals(item.getItemName(), "Milk");
  }

  @Test
  public void testGetItemPrice() {
    assertEquals(item.getItemPrice(), 1.00, 0.01);
  }

}
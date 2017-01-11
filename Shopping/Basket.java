package Shopping;
import java.util.*;

public class Basket {
  private ArrayList<Item> items;

  public Basket() {
    this.items = new ArrayList<Item>();
  }

    public int countItemsInBasket() {
      return items.size();
    }

    public void insert(Item item) {
     items.add(item);
    }

    public ArrayList<Item> checkAddedItems() {
     return this.items;
   }

 }
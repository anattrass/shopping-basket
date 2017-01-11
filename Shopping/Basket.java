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

    public void removeFirstItem() {
      items.remove(0);
    }

    public void emptyBasket() {
      items.clear();
    }

    public ArrayList<Item> checkAddedItems() {
     return this.items;
   }

 }
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

    public double getTotal(){
      double total = 0;
      for(Item item : this.items) {
        total += item.getItemPrice();
      }
    return total;
    }

    public ArrayList<Item> checkAddedItems() {
     return this.items;
   }

   public double tenPercentOff() {
      double total = getTotal();
      if (total >= 20.0) {
        return total * 0.9;
      }
      return total;
    }

   }
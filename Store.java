import java.util.ArrayList;

public class Store {
    private int profit;
    private ArrayList<ItemForSale> items = new ArrayList<ItemForSale>();

    public void showItems() {
        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i).toString() + " ");
        }
    }

    public void addItem(ItemForSale item) {
        items.add(item);
    }

    public void sellItem(ItemForSale item) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).toString().equals(item.toString())) {
                
                profit += items.get(i).getPrice();
                items.remove(i);

                return;
            }
        }
    }

    public String creator(ItemForSale item) {
        return item.getCreator();
    }

    public int getProfit() {
        return profit;
    }
}

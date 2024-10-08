import java.util.Date;

public abstract class ItemForSale {
    private String name;
    private int price;
    private Date saleDate;
    
    public ItemForSale(String iName, int iPrice, Date iSaleDate) {
        name = iName;
        price = iPrice;
        saleDate = iSaleDate;
    }

    public String toString() {
        return name + " $" + price + " Added on " + saleDate.toString();
    }

    public int getPrice() {
        return price;
    }

    abstract public String getCreator();
}

import java.util.Date;

public class Main {
    // Your tests go here! I expect you to make sure various parts of your program
    // work.

    public static void main(String[] args) {
        Store s = new Store();
        Book b = new Book("Hello", 15, new Date(), new String[]{"James Joyce"}, new Date[]{new Date()}, "Penguin House");
        Movie m = new Movie("The Matrix", 12, new Date(), new String[]{"Big Director"}, 126.7);

        s.addItem(m);
        s.addItem(b);

        s.showItems();

        s.sellItem(m);

        System.out.println(s.getProfit());
        s.showItems();
    }
}

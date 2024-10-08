import java.util.Date;

public class Book extends ItemForSale {
    private String[] authors;
    private Date[] authorBirthdays;
    private String publisher;
    
    public Book(String iName, int iPrice, Date iSaleDate, String[] iAuthors, Date[] iAuthorBirthdays, String iPublisher) {
        super(iName, iPrice, iSaleDate);

        authors = iAuthors;
        authorBirthdays = iAuthorBirthdays;
        publisher = iPublisher;
    }

    public String toString() {
        String authorString = "";

        for (int i = 0; i < authors.length; i++) {
            authorString += authors[i] + " (" + authorBirthdays[i] + ")";
        }

        return super.toString() + " : By " + authorString + " Published by " + publisher + "\n";
    }

    public String getCreator() {
        String authorString = "";

        for (int i = 0; i < authors.length; i++) {
            authorString += authors[i] + " (" + authorBirthdays[i] + ")";
        }

        return authorString;
    }
}

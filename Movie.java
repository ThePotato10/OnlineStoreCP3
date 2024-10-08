import java.util.Date;

public class Movie extends ItemForSale {
    private String[] creators;
    private double runtime;

    public Movie(String iName, int iPrice, Date iSaleDate, String[] iCreators, double iRuntime) {
        super(iName, iPrice, iSaleDate);

        creators = iCreators;
        runtime = iRuntime;
    }

    public String toString() {
        String authorString = "";

        for (int i = 0; i < creators.length; i++) {
            authorString += creators[i] + " ";
        }

        return super.toString() + " : Created by " + authorString + "\n";
    }

    public String getCreator() {
        String authorString = "";

        for (int i = 0; i < creators.length; i++) {
            authorString += creators[i] + " ";
        }

        return authorString;
    }
}

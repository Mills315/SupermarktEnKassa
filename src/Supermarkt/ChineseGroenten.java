package Supermarkt;

public class ChineseGroenten extends Food {

    public ChineseGroenten(int aantal, int dagenhoudbaar) {
        super(aantal, dagenhoudbaar);
        this.prijs = (5.00 * aantal);
    }

    public double getAantal() {
        return aantal;
    }

    public double getPrijs() {
        return prijs;
    }
}

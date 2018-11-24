package Supermarkt;

public class Kwark extends Food {

    public Kwark(int aantal, int dagenhoudbaar) {
        super(aantal, dagenhoudbaar);
        this.prijs = (2 * aantal);
    }

    public double getAantal() {
        return aantal;
    }

    public double getPrijs() {
        return prijs;
    }

    public double getKorting() {
        return korting;
    }
}

package Supermarkt;

public class ChineseGroenten extends Artikel {

    private double prijs;

    public ChineseGroenten(int aantal) {
        this.aantal = aantal;
        this.prijs = (5.00 * aantal);
    }

    public double getAantal() {
        return aantal;
    }
    public double getPrijs() {
        return prijs;
    }
}

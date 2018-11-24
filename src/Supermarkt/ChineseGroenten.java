package Supermarkt;

public class ChineseGroenten extends Food {

    public ChineseGroenten(int aantal, int dagenhoudbaar) {
        this.aantal = aantal;
        this.dagenhoudbaar = dagenhoudbaar;
        this.prijs = (5.00 * aantal);
    }

    public double getAantal() {
        return aantal;
    }
    public double getPrijs() {
        return prijs;
    }
}

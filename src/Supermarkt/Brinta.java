package Supermarkt;

public class Brinta extends Artikel {

    private double prijs;

    public Brinta(int aantal) {
        this.aantal = aantal;
        this.prijs = (2.50 * aantal);
    }

    public double getAantal() {
        return aantal;
    }
    public double getPrijs() {
        return prijs;
    }
}

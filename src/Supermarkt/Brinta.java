package Supermarkt;

public class Brinta extends Food {


    public Brinta(int aantal, int dagenhoudbaar) {
        super(aantal, dagenhoudbaar);
        this.prijs = (2.50 * aantal);
    }

    public double getAantal() {
        return aantal;
    }

    public double getPrijs() {
        return prijs;
    }
}

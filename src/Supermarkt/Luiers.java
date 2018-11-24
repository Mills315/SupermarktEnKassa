package Supermarkt;

public class Luiers extends NonFood {

    public Luiers(int aantal) {
        this.aantal = aantal;
        this.prijs = (10.00 * aantal);
    }

    public double getAantal() {
        return aantal;
    }
    public double getPrijs() {
        return prijs;
    }
}

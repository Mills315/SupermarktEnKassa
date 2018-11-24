package Supermarkt;

public class Brinta extends Food {

    public Brinta(int aantal, String houdbaarheidsdatum) {
        this.aantal = aantal;
        this.houdbaarheidsdatum = houdbaarheidsdatum;
        this.prijs = (2.50 * aantal);
    }

    public double getAantal() {
        return aantal;
    }
    public double getPrijs() {
        return prijs;
    }
}

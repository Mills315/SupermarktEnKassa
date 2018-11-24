package Supermarkt;

public class ChineseGroenten extends Food {

    public ChineseGroenten(int aantal, String houdbaarheidsdatum) {
        this.aantal = aantal;
        this.houdbaarheidsdatum = houdbaarheidsdatum;
        this.prijs = (5.00 * aantal);
    }

    public double getAantal() {
        return aantal;
    }
    public double getPrijs() {
        return prijs;
    }
}

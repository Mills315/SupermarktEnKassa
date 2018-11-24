package Supermarkt;

public class Kwark extends Food {

    public Kwark(int aantal, int dagenhoudbaar, String dag) {
        super(aantal, dagenhoudbaar);
        if (dag.equals("Woensdag")) {
            double korting = 0.0;
            this.prijs = aantal;
            this.korting = aantal;
        } else {
            this.prijs = aantal * 2;
        }

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

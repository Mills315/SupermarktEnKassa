package Supermarkt;

public class Luiers extends NonFood {

    public Luiers(int aantal) {
        super(aantal);
        double korting = 0.0;
        double totaalzonderkorting = aantal * 10.0;
        int count = 0;
        while (aantal >= 4) {
            aantal = aantal - 4;
            count++;
        }
        this.prijs = (10.00 * aantal) + (count * 30);
        this.korting = totaalzonderkorting - this.prijs;
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

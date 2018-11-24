package Supermarkt;

public class Robijn extends NonFood {

    public Robijn(int aantal) {
        super(aantal);
        double korting = 0.0;
        double totaalzonderkorting = aantal * 3.0;
        int count = 0;
        while(aantal >= 2){
            aantal = (aantal - 2);
            count++;
        }
        this.prijs = (3.00 + (4.14*count));
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

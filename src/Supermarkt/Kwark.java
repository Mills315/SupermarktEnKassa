package Supermarkt;

public class Kwark extends Artikel {

        private double prijs;

        public Kwark(int aantal) {
            this.aantal = aantal;
            this.prijs = (2 * aantal);
        }

        public double getAantal() {
            return aantal;
        }
        public double getPrijs() {
            return prijs;
        }
}

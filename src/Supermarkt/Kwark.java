package Supermarkt;

public class Kwark extends Food {

        public Kwark(int aantal, String houdbaarheidsdatum) {
            this.aantal = aantal;
            this.houdbaarheidsdatum = houdbaarheidsdatum;
            this.prijs = (2 * aantal);
        }

        public double getAantal() {
            return aantal;
        }
        public double getPrijs() {
            return prijs;
        }
}

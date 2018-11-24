package Supermarkt;

public class Food extends Artikel {

    protected int dagenhoudbaar;

    public Food(int aantal, int dagenhoudbaar) {
        this.aantal = aantal;
        this.dagenhoudbaar = dagenhoudbaar;
    }

}

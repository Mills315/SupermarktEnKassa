package Supermarkt;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Artikel> artikelen = getArtikel();
        printPrijsArtikelen(getArtikel());
    }

    private static List<Artikel> getArtikel() {
        List<Artikel> artikelen = new ArrayList<>();
        artikelen.add(new Luiers(10));
        artikelen.add(new Robijn(3));
        artikelen.add(new Brinta(10, 14));
        artikelen.add(new ChineseGroenten(6, 10));
        artikelen.add(new Kwark(7, 14));
        return artikelen;
    }

    private static void printPrijsArtikelen(List<Artikel> artikelen) {
        for (Artikel artikel : artikelen) {
            if (artikel instanceof Artikel) {
                System.out.println(artikel.getPrijs());
            }
        }
    }
}

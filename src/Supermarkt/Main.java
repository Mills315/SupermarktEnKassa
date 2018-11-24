package Supermarkt;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Artikel> artikelen = getArtikel();

        System.out.println(artikelen);
    }

    private static List<Artikel> getArtikel() {
        List<Artikel> artikelen = new ArrayList<>();
        artikelen.add(new Luiers(10));
        artikelen.add(new Robijn(3));
        artikelen.add(new Brinta(15));
        artikelen.add(new ChineseGroenten(6));
        artikelen.add(new Kwark(7));
        return artikelen;


    }


}

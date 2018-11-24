package Supermarkt;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Artikel luiers = new Luiers(10);
        Artikel robijn = new Robijn(3);
        Artikel brinta = new Brinta(15);
        Artikel chinesegroenten = new ChineseGroenten(6);
        Artikel kwark = new Kwark(7);


        System.out.println(((Luiers) luiers).getAantal());
        System.out.println(((Luiers) luiers).getPrijs());

        // als xx is instanceof Artikel then afrekenmethode?
    }

    private static List<Artikel> getArtikel(){
        List<Artikel> artikelen = new ArrayList<>();
        artikelen.add(new Luiers(10));

        return artikelen;


    }



}

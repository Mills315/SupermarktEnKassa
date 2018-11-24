package Supermarkt;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        
        List<Artikel> artikelen = getArtikel();
        printPrijsArtikelen(getArtikel());
        System.out.println("------+");
        System.out.println(totaalPrijs(artikelen));
        System.out.println();
        System.out.println("De boodschappen kosten " + (totaalPrijs(artikelen)));
        System.out.println("Het wisselgeld is: ");
        System.out.println();
        betalen(555.55, artikelen);
        System.out.println();
        System.out.println("Uw korting is: ");
        System.out.println();
        System.out.println(totaalKorting(artikelen));
        System.out.println();
        System.out.println();


        // bedenk manieren om kortingen te verwerken, bijvoorbeeld met modulo en een randomInt/weekdag voor weekdagen/korting
    }


    // hier worden artikelen toegevoegd, met aantallen

    private static List<Artikel> getArtikel() {
        List<Artikel> artikelen = new ArrayList<>();
        artikelen.add(new Luiers(7));
        artikelen.add(new Robijn(15));
        artikelen.add(new Brinta(10, 14));
        artikelen.add(new ChineseGroenten(6, 10));
        artikelen.add(new Kwark(7, 14));
        return artikelen;
    }

    // hier worden de afzonderlijke totaalprijzen per product geprint

    private static void printPrijsArtikelen(List<Artikel> artikelen) {
        for (Artikel artikel : artikelen) {
            System.out.println(artikel.getPrijs());
        }
    }

    // hier worden de totaalprijs van de hele 'winkelwagen' geprint

    private static double totaalPrijs(List<Artikel> artikelen) {
        double totaal = 0.0;
        for (Artikel artikel : artikelen) {
            totaal = totaal + artikel.getPrijs();
        }
        return totaal;
    }

    // hier wordt er 'geld' gegeven; als dat meer is dan het totaal, wordt er wisselgeld berekend per 100/10/1/0.1/0.01-tal

    private static void betalen(double geld, List<Artikel> artikelen) {
        double wisselgeld;
        double totaal = 0.0;
        for (Artikel artikel : artikelen) {
            totaal = totaal + artikel.getPrijs();
        }
        if (geld >= totaal) {
            int b100 = 0;
            int b10 = 0;
            int b1 = 0;
            int b010 = 0;
            int b001 = 0;
            wisselgeld = (geld - totaal);

            // wisselgeld heeft meer dan 2 cijfers achter de komma?? heel vreemd.. even vragen aan Gillis/Hans

            // kan eventueel ook andere briefjes toevoegen.. denk aan tientallen eerst delen door 20 tot je minder dan 20 over houdt.. et cetera

            System.out.println(wisselgeld);

            // aantal divisions met modulo ? dit werkt ook.
            while (wisselgeld > 100) {
                wisselgeld -= 100;
                b100++;
            }
            while (wisselgeld > 10) {
                wisselgeld -= 10;
                b10++;
            }
            while (wisselgeld > 1) {
                wisselgeld -= 1;
                b1++;
            }
            while (wisselgeld > 0.1) {
                wisselgeld -= 0.1;
                b010++;
            }
            while (wisselgeld > 0.01) {
                wisselgeld -= 0.01;
                b001++;
            }

            // dit stukje staat erin om het meer dan 2 cijfers achter de komma te ondervangen. had er niet in hoeven staan. of misschien toch na de kortingen zooi, kom ik zo wel achter

            while (wisselgeld > 0.001) {
                wisselgeld = wisselgeld - wisselgeld;
            }
            if (wisselgeld == 0.0) {
                System.out.println("Hier heeft u:");
                System.out.println();
                System.out.println(b100 + " briefjes van 100 euro");
                System.out.println(b10 + " briefjes van 10 euro");
                System.out.println(b1 + " munten van 1 euro");
                System.out.println(b010 + " munten van 10 cent");
                System.out.println(b001 + " munten van 1 cent");
            }
            if (geld < totaal) {
                System.out.println("Dat is niet genoeg om de rekening te betalen!");
            }
        }

    }

    private static double totaalKorting(List<Artikel> artikelen) {
        double totaal = 0.0;
        for (Artikel artikel : artikelen) {
            totaal = totaal + artikel.getKorting();
        }
        return totaal;
    }
}

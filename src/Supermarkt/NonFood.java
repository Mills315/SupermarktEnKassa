package Supermarkt;

public class NonFood extends Artikel {

    public NonFood(int aantal) {
        this.aantal = aantal;

        // Je kan in deze constructor dingen printen die je niet in Food wil printen
        // System.out.println("Ik ben voor altijd houdbaar!");
    }

}

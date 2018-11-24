package Supermarkt;

import java.util.Random;

public class DagVanDeWeek {

    private String dayString;

    public DagVanDeWeek(int n) {
        switch (n) {
            case 1:
                dayString = "Maandag";
                break;
            case 2:
                dayString = "Dinsdag";
                break;
            case 3:
                dayString = "Woensdag";
                break;
            case 4:
                dayString = "Donderdag;";
                break;
            case 5:
                dayString = "Vrijdag";
                break;
            case 6:
                dayString = "Zaterdag";
                break;
            case 7:
                dayString = "Zondag";
                break;
            default:
                dayString = "Invalid input";
        }
        System.out.println("Het is: " + dayString);
    }

    public String getDay() {
        return dayString;
    }
}

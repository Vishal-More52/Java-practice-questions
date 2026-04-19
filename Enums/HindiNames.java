package Enums;

enum HindiDay {
    MONDAY("Somwar"), 
    TUESDAY("Mangalwar"),
    SUNDAY("Ravivar");

    private String hindiName;

    // Constructor must be private or default
    private HindiDay(String hindiName) {
        this.hindiName = hindiName;
    }

    public String getHindiName() {
        return hindiName;
    }
}

public class HindiNames {
    public static void main(String[] args) {
        HindiDay d = HindiDay.MONDAY;
        System.out.println("Hindi Name: " + d.getHindiName()); // Prints Somwar
    }
}
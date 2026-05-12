package Enums;

enum Difficulty{
    EASY(1.0),
    MIDIUM(1.5),
    HARD(2.5);

    private final double multiplier;

    //constructor (always private for enums)
    Difficulty(double multiplier){
        this.multiplier = multiplier;
    }

    public double calculateScore(int basePoints){
        return basePoints * this.multiplier;
    }
}
public class Game {
    public static void main(String[] args) {
        Difficulty level = Difficulty.HARD;
        System.out.println("Points earned: " + level.calculateScore(100));
    }
}

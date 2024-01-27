import java.util.ArrayList;

public class TestPuzzleJava {
    
    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();

        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println("Random Rolls: " + randomRolls);

        String randomLetterArray = generator.getRandomLetterWithArray();
        System.out.println("Random Letter with Array: " + randomLetterArray);

        String randomLetter = generator.getRandomLetter();
        System.out.println("Random Letter: " + randomLetter);

        String password = generator.generatePassword();
        System.out.println("Generated Password: " + password);

        ArrayList<String> passwordSet = generator.getNewPasswordSet(5);
        System.out.println("Generated Password Set: " + passwordSet);

        ArrayList<String> anotherPasswordSet = generator.getNewPasswordSet(3);
        System.out.println("Another Password Set: " + anotherPasswordSet);
    }
}
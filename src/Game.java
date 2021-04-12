import java.util.ArrayList;

public class Game {
    public static void main(String[] args) {
        int numOfGuesses = 0;

        GameHelper helper = new GameHelper();

        DotCom program = new DotCom();

        int randomNum = (int) (Math.random() * 5);
        String[] mass = new String[]{Integer.toString(randomNum), Integer.toString(randomNum + 1), Integer.toString(randomNum + 2)};



        boolean isAlive = true;

        while (isAlive) {
            String guess = helper.getUserInput("Введите число: ");
            String result = program.checkYourself(guess);

            numOfGuesses++;
            if (result.equals("Потопил!")) {
                isAlive = false;
                System.out.println("Вам потребовалось " + numOfGuesses + " попыток(и).");
            }
        }
    }
}
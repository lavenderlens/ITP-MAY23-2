import java.util.Scanner;

public class IterativeGuessingGame

public static void (String[] args)
{
    int magicNumber = (int) (Math.random() * 10) + 1;
    int numGuess = 1;
    boolean win = false;
    Scanner s = new Scanner(System.in);
    while(numGuess <= 3) {
        System.out.println("Guess the magic number in the range 1-10 " + numGuess + " of 3: ");
        int userGuess = s.nextInt();
        if(userGuess == magicNumber) {
            System.out.println("You got it!");
            win = true;
            break;
        } else if(userGuess + 1 == magicNumber || userGuess - 1 == magicNumber) {
            System.out.println("So close!");
        } else {
            System.out.println("Way off!");
        }
        numGuess += 1;
    }
    if(win) {
        System.out.println("You win!");
    } else {
        System.out.println("You lose!");
    }
}

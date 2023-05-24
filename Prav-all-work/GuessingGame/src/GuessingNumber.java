import java.util.Scanner;

public class GuessingNumber {

    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 10) + 5;
        Scanner s = new Scanner(System.in);
        System.out.println(" Guess the first number");
        int Firstguess = s.nextInt();

        if (Firstguess == randomNumber) {
            System.out.println("That's a correct guess");
        } else System.out.println("You did not guess the random number");
    }
}



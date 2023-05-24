import java.util.Scanner;

public class IterativeSquarer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean proceed = true;
//        while (true) {
        while (proceed) {
            System.out.println("Enter number to square, or a 0 to quit ");
            int myNum = s.nextInt();
            if (myNum == 0) {
                proceed = false;
//                break;
            } else {
                System.out.println(myNum * myNum);
            }
        }
    }
}

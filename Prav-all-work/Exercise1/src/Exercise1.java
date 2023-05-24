import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args)
    {

    String name ="Smith";
    int myNum=43317878;
    float myfloat=250.70f;
    boolean myBool= true;


    System.out.println(name);
    System.out.println(myNum);
    System.out.println(myfloat);
    System.out.println(myBool);

    //concatenation
        System.out.println("Name: " + name);
        System.out.println("Account number: " + myNum);
        System.out.println("Balance: " + myNum);
        System.out.println("Is taxable: " + true);

    // user input
    Scanner s = new Scanner(System.in);
    String nameUser = s.nextLine();
        int numUser = s.nextInt();
        double balanceUser = s.nextDouble();
        boolean taxableUser = s.nextBoolean();


        System.out.println("Name from user: " + nameUser);
        System.out.println("Account number from user: " + numUser);
        System.out.println("Balance from user: " + balanceUser);
        System.out.println("Is taxable: " + taxableUser);



    }
}

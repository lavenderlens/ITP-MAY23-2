import java.util.Scanner;
// Scanner must have an import statement here
// Scanner is in a package (bunch of classes) called Java.util
// anything other than the package Java.lang we need to specifically request
// BasicClasses doesn't need one because it is the same directory
public class BasicClassesTester {
    public static void main(String[] args) {
        BasicClasses bc = new BasicClasses();
        Scanner sc = new Scanner(System.in);
        bc.type = "an object for reading in data";
        // we don't set any fields in Scanner as it is a system class
        System.out.println(bc.getType());
        // but we call methods of Scanner just like we call our one method of BasicClasses
//         int myNumber = sc.nextInt(); // pauses execution, returns an int type from what the user typed in
//         String myString = sc.nextLine(); // pauses execution, returns a String type from what the user typed in

        // but we pause for keyboard input, so we should have a prompt to the user (us)

         System.out.println("enter your name (a String):");
         String myString = sc.nextLine(); // pauses for input, returns a String type

         System.out.println("enter your age (a whole number):");
         int myNumber = sc.nextInt(); // pauses for input, returns an int type

        System.out.println("Name entered: " + myString);
        System.out.println("Age entered: " + myNumber);



    }
}

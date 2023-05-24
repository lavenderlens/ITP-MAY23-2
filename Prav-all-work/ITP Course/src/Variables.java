import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        int myInt = 42;
        float myFloat = 42.0f; // other data number datatypes may require a SUFFIX
        // int and double do not
        //int is default Integral(whole number) type
        //double is default floating-point(decimal number) type
        System.out.println(1/6);//0 - Java assumes these are whole numbers
        System.out.println(1.0/6.0);// 0.166666666666666
        System.out.println(1.0/0.6);// 1.6666666666667
        System.out.println(1.0/0.3); //3.333333333335
        System.out.println();
        var mydouble=43.0d;

        Integer myInteger = new Integer(1);
        Integer myIntWrapped = new Integer(myInt);
   //     myIntWrapped. //see methods available

        var mydouble2 = 1.0;
        double mydouble3=1.0;
        Double mydouble4 = Double.valueOf( 1.0);

        //only dtattypes we will use for numbers are
        // int and double, the default Integral and floating-point

        boolean myBoolean = true;

        char c = 'C'; //single quotes in java is char datatype

        String s = "Hello";

        //can also declre only assign later, only if not used
        String s1;
       // System.out.println(s1);// want to be initialised at some point in the future
        //re-assignment
        s1 = "Goodbye";

        //make a var final -write protected
        final double VATRate=0.2;
 //       vatRate =0.3;

        String stringNumber = "1";
        String stringNumber2 = "1";
        System.out.println(stringNumber + stringNumber2) ; //11
        //coerce the string to numbers
        System.out.println(Integer.parseInt(stringNumber) + Integer.parseInt(stringNumber2)); //2

         // user input

        Scanner scanner = new Scanner(System.in);

           int int1 = scanner.nextInt();

    }
}

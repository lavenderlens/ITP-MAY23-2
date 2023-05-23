import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
    int myInt = 42;
    float myFloat = 42.0f;//other number datatypes may require a SUFFIX
        // int and double do not
        // int is default Integral (whole number) type
        // double is default floating-point (decimal number) type
        System.out.println(1/6);//0 - Java assumes theses are whole numbers
        System.out.println(1.0/6.0);//0.16666666666666666
        System.out.println(1.0/0.6);//1.6666666666666667
        System.out.println(1.0/0.3);//3.3333333333333335
        System.out.println();
//        var mydouble = 43.0d; // won't use this for teaching

        Integer myInteger = new Integer(1);
        Integer myIntWrapped = new Integer(myInt);
//        myIntWrapped.//see methods available

        var mydouble2 = 1.0;
        double mydouble3 = 1.0;
        Double mydouble4 = new Double(1.0);

        // the only datatypes we will use for numbers are
        // int and double, the default Integral and floating-point

        boolean myBoolean = true;

        char c = 'C';//single quotes in Java is char datatype

        String s = "Hello";

        // can also declare only, assign later, only if not used
        String s1;
//        System.out.println(s1);//wants to be initialised at some point in the future
        //re-assignment
        s = "Goodbye";

        // make a var final - write protected
        final double vatRate = 0.2;
//        vatRate = 0.3;

        String stringNumber = "1";
        String stringNumber2 = "1";
        System.out.println(stringNumber + stringNumber2);//11
        // coerce the strings to numbers
        System.out.println(Integer.parseInt(stringNumber) + Integer.parseInt(stringNumber2));//2

//        user input
        Scanner scanner = new Scanner(System.in);

//        int int1 = scanner.nextInt();


        // Java string formatting

        String output = String.format("My greeting is %s and my VAT rate is %.2f", s, vatRate);
        System.out.println(output);
        System.out.printf("My greeting is %s and my VAT rate is %.2f\n", s, vatRate);//doesn't include a new line


    }
}

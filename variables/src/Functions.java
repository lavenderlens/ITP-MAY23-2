public class Functions {
    // or here, but conventionally not
    public static void main(String[] args) {
        /**
         *      * methods (aka functions) are of four basic types:
         *      * 1. no input, no output
         *      * 2. no input, output
         *      * 3. input, output
         *      * 4. input, no output
         *      *
         *      * method declarations consist of, at their simplest,
         *      * a return type (void even if there is no other type)
         *      * a method name
         *      * invocating brackets / parameters at method declaration time,
         *      (arguments at runtime)
         *      some body of code OR the keyword abstract (outside the remit of this course)
         */
        greetFromMain();
        // normally we make objects here and call their IMNSTANCE methods
        // (methods that belong to a new object of that class)
        Greet g1 = new Greet();
        g1.greet1();
        g1.greet2();//no visible output here yet
        String greet2Output = g1.greet2();
        System.out.println(greet2Output);
        System.out.println(g1.greet2());//output as input

        System.out.println(g1.greet3("Alan"));

        g1.greet4("Prav");

    }//end main
    // here is where we define methods in a class with a main method
    // we use the keyword static
    // because there is no instance of this class
    public static void greetFromMain(){
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("How are you today?");
    }
}//end class

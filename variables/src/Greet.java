public class Greet {
    // no main method
    // no input, no output
    public void greet1(){
        System.out.println("Hello");
        System.out.println("World greet1");
        System.out.println("How are you today?");
    }
    // no input, output
    public String greet2(){
        return "Hello World greet2 How are you today?";
    }

    // input, output
    public String greet3(String name){
        return "Hello World " + name + " How are you today?";
    }

    // input, no output
    public void greet4(String name){
        System.out.println("Hello World " + name + " How are you today?");
    }
}

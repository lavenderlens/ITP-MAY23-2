public class Conditionals {
    public static void main(String[] args) {
        // one branch
        if(false){
            System.out.println("IF clause entered");
        }

        // two branch if - else
        if(false){
            System.out.println("IF clause entered");
        } else {
            System.out.println("ELSE block entered");
        }

        // three or more branches
        if(false){
            System.out.println("FIRST IF clause entered");
        } else if(true) {
            System.out.println("SECOND IF clause entered");
        } else{
            System.out.println("ELSE block entered");
        }

        String token = "Y";

        // switch with break
        // executes just the one matching case OR the default
        switch(token){
            case "X":
                System.out.println("You entered X");
                break;
            case "Y":
                System.out.println("You entered Y");
                break;
            case "Z":
                System.out.println("You entered Z");
                break;
                default:
                    System.out.println("Enter a letter, X, Y, or Z");
        }// end 1st switch

        // additive switch without break
        // executes one or more cases and default
        int mealOption = 1;
        switch(mealOption){
            case 3:
                System.out.println("Drink, ");
            case 2:
                System.out.println("fries, ");
            case 1:
                System.out.println("burger.");
            default:
                System.out.println("Thank you for your order!");

        }
    }//end main
}//end class

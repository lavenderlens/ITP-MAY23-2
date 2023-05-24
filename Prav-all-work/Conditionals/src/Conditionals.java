public class Conditionals {
    public static void main(String[] args) {
        //one branch
        if(true){
            System.out.println("If clause entered");
        }

        //two branch if -else
        if(false) {
            System.out.println("If clause entered");
        }else {
            System.out.println("Else block entered");
        }

        //theree or more branches
        if(false) {
            System.out.println("First If clause entered");
        } else if(true) {
        } esle {
            System.out.println("Else block entered");
        }

        var token = "X";

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
                    System.out.println(("Enter a letter X, Y or Z");
        } // end 1st swith

        //additive switch wthout break
        //execute one or more cases and default
        int mealOption=3;
        switch(mealOption){
            case 3:
                System.out.println("Drink,  ");
            case 2:
                System.out.println("fries, ");
            case 1:
                System.out.println("burger. ");
            default:
                System.out.println("Thank you ofr your order!");
        }
    }//end main
}

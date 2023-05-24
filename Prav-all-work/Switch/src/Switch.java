import java.util.Scanner;

public class Switch {

    public static void main (String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("are at checkout, choose T-shirt size:");
        System.out.println("S, M, L, 2XL:");
        String size =s.next();
        String[] orderLine = new String[1];
        switch(size) {
            case "S":
                System.out.println("You chose SMALL");
                orderLine[0] = "S"; //you can do multiple things in each case statement
                break;
            case "M":
                System.out.println("You chose Medium");
                orderLine[0] = ""; //you can do multiple things in each case statement
                break;
            case "L":
                System.out.println("You chose LARGE");
                orderLine[0] = "L"; //you can do multiple things in each case statement
                break;
            case "2XL":
                System.out.println("You chose 2XLARGE");
                orderLine[0] = "2XL"; //you can do multiple things in each case statement
                break;
            default:
                System.out.println("choose from S,M,L,2XL");
        }
        for(String order : orderLine) {
            System.out.println(order);

        }


    }
}

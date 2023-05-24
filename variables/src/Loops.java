public class Loops {
    public static void main(String[] args) {
        int counter = 10;
        do{
            System.out.println("do-while " + (counter + 1));
            counter++;
        } while (counter < 5);

        String[] delegates = {"Jenny", "Prav", "Evie"};

        int counter2 = 0;
        do{
            System.out.println(delegates[counter2]);
            counter2++;
        } while (counter2 < delegates.length);

        int counter3 = 10;
        do{
//            System.out.println(delegates[counter3]);//index doesn't exist, throws ArrayIndexOutOfBoundsException
            // this code doesn't error because of the do-while loop,
            // but because of this line where it asks for a non-existent index
            counter3++;
        } while (counter3 < delegates.length);

        for (int i = 0; i < delegates.length; i++) {
            System.out.println(delegates[i]);
        }

        int num = 1;
        num = num + 1;
        num += 1;
        int result = 10 + num++;
        System.out.println(result);//13 num is incremented AFTER USE : postfix increment/decrement
        System.out.println(num);//4 outside of an expression

        int num2 = 1;
        num2 = num2 + 1;
        num2 += 1;
        int result2 = 10 + ++num2;
        System.out.println(result2);//14 num2 is incremented BEFORE USE in the expression : prefix
        System.out.println(num2);//4 outside of an expression

        System.out.println("using break");

        for (int i = 0; i < delegates.length; i++) {
            if(delegates[i] == "Prav"){
                break;
            }
            System.out.println(delegates[i]);
        }

        System.out.println("using continue");

        for (int i = 0; i < delegates.length; i++) {
            if(delegates[i] == "Prav"){
                continue;
            }
            System.out.println(delegates[i]);
        }

    }
}

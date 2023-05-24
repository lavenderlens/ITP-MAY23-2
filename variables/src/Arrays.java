public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {2,4,6,8};//var does not work in this statement
        System.out.println(numbers.length);//4
        System.out.println(numbers[0]);//first
        System.out.println(numbers[3]);//last (length - 1)
        System.out.println(numbers[4]);//ArrayIndexOutOfBoundsException

        // another way is to declare an empty array, of a certain length
        var emptyNumbers = new int[4];//the int in square brackets is the length of empty slots
        // but var works here - type inference - R-L
        emptyNumbers[0] = 1;
        emptyNumbers[1] = 3;
        emptyNumbers[2] = 5;
        emptyNumbers[3] = 7;
        emptyNumbers[4] = 9;

    }
}

public class ParametersandReturnValues {


        double getAverage ( int[] numbers) {
            int total = 0;
            for (int number : numbers) {
                total += number;
            }
            return total / numbers.length;
        }

    }//end class
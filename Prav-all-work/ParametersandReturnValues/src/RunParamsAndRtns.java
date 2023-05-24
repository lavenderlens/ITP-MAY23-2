public class RunParamsAndRtns {
    public static void main(String[] args) {

        var run = new ParametersandReturnValues();

        int[] housePrices = {318000, 347000, 428000, 282000, 273000, 362000, 343000, 332000};
        double averageHousePrice = run.getAverage(housePrices);
        System.out.println(averageHousePrice);

    }
}

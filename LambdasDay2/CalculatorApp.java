public class CalculatorApp {
    public static void main(String[] args) {
        int input = 8;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = {34, 254, 333, 12, 95};
        
        int result = SubtractLambdaCalculator.subtractLambdaLambda.apply(input);
        int addresult = AdditionLambdaCalculator.additionLambda.apply(input);
        double average = AverageLambdaCalculator.calculateAverage(arr);
        double sumresult = SumLambdaCalculator.calculateSum(arr2);
       
        System.out.println("Result of SumLambda: " + sumresult);
        System.out.println("Result of SubtractLambda: " + result);
        System.out.println("Result of AdditionLambda: " + addresult);
        System.out.println("Result of AverageLambda: " + average);
    }
}
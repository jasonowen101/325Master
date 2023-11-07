import java.util.Arrays;

public class SumLambdaCalculator {
    public static double calculateSum(int[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}
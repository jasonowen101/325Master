import java.util.Arrays;

public class AverageLambdaCalculator {
    public static double calculateAverage(int[] numbers) {
        return Arrays.stream(numbers)
            .average().orElse(0.0);
    }
}
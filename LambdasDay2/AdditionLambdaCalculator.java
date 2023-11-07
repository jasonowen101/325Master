import java.util.function.Function;

public class AdditionLambdaCalculator {
    public static Function<Integer, Integer> additionLambda = (a) -> (a * 4) + (a + 2);
}
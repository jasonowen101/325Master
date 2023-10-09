// JTO Parallel Programming Example

import java.util.concurrent.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParallelArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Initialize your array here
        int numThreads = Runtime.getRuntime().availableProcessors(); // Get the number of available CPU cores
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        int chunkSize = arr.length / numThreads;
        int startIndex = 0;
        int endIndex = chunkSize;

        // Create a list to hold the Future objects for each chunk's sum
        List<Future<Integer>> futures = new ArrayList<>();

        // Split the array into chunks and calculate the sum for each chunk concurrently
        for (int i = 0; i < numThreads; i++) {
            if (i == numThreads - 1) {
                endIndex = arr.length; // Adjust the end index for the last chunk
            }
            int[] chunk = Arrays.copyOfRange(arr, startIndex, endIndex);
            Callable<Integer> task = () -> {
                int sum = 0;
                for (int num : chunk) {
                    sum += num;
                }
                return sum;
            };
            futures.add(executor.submit(task));
            startIndex = endIndex;
            endIndex += chunkSize;
        }

        // Combine the results
        int totalSum = 0;
        for (Future<Integer> future : futures) {
            try {
                totalSum += future.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();

        // Display the final sum
        System.out.println("Total Sum: " + totalSum);
    }
}

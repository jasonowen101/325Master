public class MultiThreadingExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Create and start two threads to calculate the sum of numbers
        SumCalculatorThread thread1 = new SumCalculatorThread(numbers, 0, 4);
        SumCalculatorThread thread2 = new SumCalculatorThread(numbers, 5, 9);
        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to finish
            thread1.join();
            thread2.join();

            // Calculate the final sum by combining results from both threads
            int totalSum = thread1.getSum() + thread2.getSum();
            System.out.println("Total Sum: " + totalSum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class SumCalculatorThread extends Thread {
    private int[] numbers;
    private int start;
    private int end;
    private int sum;

    public SumCalculatorThread(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
        this.sum = 0;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            sum += numbers[i];
        }
    }
}
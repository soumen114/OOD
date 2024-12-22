public class SimplePrimeSumCalculator10a {
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Thread class to calculate the sum of primes in a specific range
    static class PrimeThread extends Thread {
        private int start;
        private int end;
        private int[] result;

        public PrimeThread(int start, int end, int[] result) {
            this.start = start;
            this.end = end;
            this.result = result;
        }

        @Override
        public void run() {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isPrime(i)) {
                    sum += i;
                }
            }
            result[0] = sum; // Store the result in the shared array
        }
    }

    // Method to calculate the sum of primes up to a given limit using multiple threads
    public static int calculatePrimeSum(int limit, int numThreads) throws InterruptedException {
        int rangeSize = limit / numThreads;
        int[] result = new int[numThreads];
        PrimeThread[] threads = new PrimeThread[numThreads];

        // Create and start threads
        for (int i = 0; i < numThreads; i++) {
            int start = i * rangeSize + 1;
            int end = (i == numThreads - 1) ? limit : (i + 1) * rangeSize;
            threads[i] = new PrimeThread(start, end, result);
            threads[i].start();
        }

        // Wait for all threads to finish
        for (int i = 0; i < numThreads; i++) {
            threads[i].join();
        }

        // Sum up all the results from threads
        int totalSum = 0;
        for (int i = 0; i < numThreads; i++) {
            totalSum += result[i];
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int limit = 100000; // Change the limit as needed
        int numThreads = 8; // Number of threads to use

        try {
            int primeSum = calculatePrimeSum(limit, numThreads);
            System.out.println("The sum of prime numbers up to " + limit + " is: " + primeSum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
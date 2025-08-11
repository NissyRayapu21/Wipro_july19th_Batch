package Lab2_08;

class PrimeSum extends Thread {
    int start, end;
    int sum = 0;

    public PrimeSum(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            if (SumPrime(i)) {
                sum += i;
            }
        }
    }

    boolean SumPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

public class SumPrime {
    public static void main(String[] args) {
        
        PrimeSum t1 = new PrimeSum(1, 50);
        PrimeSum t2 = new PrimeSum(51, 100);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int total = t1.sum + t2.sum;
        System.out.println("Sum of prime numbers from 1 to 100: " + total);
    }
}

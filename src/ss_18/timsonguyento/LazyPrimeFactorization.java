package ss_18.timsonguyento;

public class LazyPrimeFactorization implements Runnable {

    private volatile boolean running = true;

    @Override
    public void run() {
        int num = 2; // Bắt đầu kiểm tra từ số 2
        while (running) {
            if (isPrime(num)) {
                System.out.println("LazyPrimeFactorization: " + num + " là số nguyên tố.");
            }
            num++;
            try {
                Thread.sleep(1000); // Thay đổi độ trễ nếu cần
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    // Kiểm tra số nguyên tố cơ bản
    private boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Dừng quá trình
    public void stop() {
        running = false;
    }
}



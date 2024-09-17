package ss_18.timsonguyento;

public class OptimizedPrimeFactorization implements Runnable {

    private volatile boolean running = true;

    @Override
    public void run() {
        int num = 2; // Bắt đầu kiểm tra từ số 2
        while (running) {
            if (isPrime(num)) {
                System.out.println("OptimizedPrimeFactorization: " + num + " là số nguyên tố.");
            }
            num++;
            try {
                Thread.sleep(1000); // Thay đổi độ trễ nếu cần
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    // Kiểm tra số nguyên tố với thuật toán tối ưu
    private boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number <= 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) return false;
        }
        return true;
    }

    // Dừng quá trình
    public void stop() {
        running = false;
    }
}

package ss_18.timsonguyento;

public class test {

        public static void main(String[] args) {
            // Tạo các đối tượng Runnable
            Runnable lazyTask = new LazyPrimeFactorization();
            Runnable optimizedTask = new OptimizedPrimeFactorization();

            // Tạo các thread từ các Runnable
            Thread lazyThread = new Thread(lazyTask);
            Thread optimizedThread = new Thread(optimizedTask);

            // Bắt đầu thực thi các thread
            lazyThread.start();
            optimizedThread.start();

            // Chạy trong 10 giây để quan sát kết quả
            try {
                Thread.sleep(10000); // Thay đổi thời gian nếu cần
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            // Dừng các thread
            ((LazyPrimeFactorization) lazyTask).stop();
            ((OptimizedPrimeFactorization) optimizedTask).stop();
        }


}

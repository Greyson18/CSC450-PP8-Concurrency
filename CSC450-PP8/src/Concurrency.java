import java.util.concurrent.CountDownLatch;

public class Concurrency {
    public static void main(String[] args) {
    	//CountDownLatch is being used to synchronize the two threads
        CountDownLatch latch = new CountDownLatch(1); // Start with count 1, once a thread fully executes it goes to 0 and the other begins

        // Creates and starts the counting up thread
        Thread countUpThread = new Thread(new CountUp(latch));
        countUpThread.start();

        // Creates and starts the counting down thread
        Thread countDownThread = new Thread(new CountDown(latch));
        countDownThread.start();
    }
}
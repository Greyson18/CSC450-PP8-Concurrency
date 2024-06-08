import java.util.concurrent.CountDownLatch;

class CountUp implements Runnable {
	private final CountDownLatch latch;
	
	 public CountUp(CountDownLatch latch) {
		 this.latch = latch;
	 }
	
	 @Override
	    public void run() {
		//try/catch block handles potential exceptions
	        try {
	            for (int i = 1; i <= 20; i++) {
	                System.out.println("Counting up: " + i);
	                //thread.sleep simulates processing time
	                Thread.sleep(0); //Basically no time sleep will occur as the thread processes, can be changed.
	            }
	            latch.countDown(); // Notifies when the counting is done so that it can start the next thread
	          
	            //Throws an exception if the code is interrupted while sleeping
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}
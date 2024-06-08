import java.util.concurrent.CountDownLatch;

class CountDown implements Runnable {
	private final CountDownLatch latch;
	
	 public CountDown(CountDownLatch latch) {
		 this.latch = latch;
	 }
	 
	 @Override
	    public void run() {
		 //try/catch block handles potential exceptions
	        try {
	            latch.await(); // Wait until counting up is done
	            for (int i = 20; i >= 0; i--) {
	                System.out.println("Counting down: " + i);
	              //thread.sleep simulates processing time
	                Thread.sleep(0); //Basically no time sleep will occur as the thread processes, can be changed.
	            }
	            
	        //Throws an exception if the code is interrupted while sleeping
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}
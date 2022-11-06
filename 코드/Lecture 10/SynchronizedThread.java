
class Counter {
	int count;

	public synchronized void incr() {
		count++;
	}
}

public class SynchronizedThread {
	public static void main(String[] args) throws Exception {
		Counter c = new Counter(); //instantiate counter
		//instantiate a thread t1
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i < 1000; i++)
				{
					c.incr();
				}
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i < 1000; i++)
				{
					c.incr();
				}
				
			}
		});
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		
		System.out.println("Count = " + c.count);
	}
}

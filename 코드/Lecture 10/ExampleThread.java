import java.util.Arrays;

public class ExampleThread {

	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread);
		//[name of thread, priority, group]
		runnableTask1 object = new runnableTask1();
		runnableTask2 object2 = new runnableTask2();
		Thread thread1 = new Thread(mainThread.getThreadGroup(), object, "Thread1");
		Thread thread2 = new Thread(mainThread.getThreadGroup(), object2, "Thread2");
		Thread thread3 = new Thread(mainThread.getThreadGroup(), new Runnable() {
			public void run() {
				System.out.println("Task 3");
			}
		}, "Thread3");
		thread1.start();
		thread2.start();
		thread3.start();
		
		mainThread.getThreadGroup().list();
		
			

	}

}

class runnableTask1 implements Runnable {

	@Override
	public void run() {
		//the task our thread will do
		int [] array = new int [100];
		
		for(int i = 0; i < 100; i++)
		{
			array[i] = i;
		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Arrays.toString(array));
	}
	
}

class runnableTask2 implements Runnable {

	@Override
	public void run() {
		//the task our thread will do
		System.out.println("Task 2");
	}
	
}
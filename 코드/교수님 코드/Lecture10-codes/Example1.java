import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread);
		
 		runableTask1 object1 = new runableTask1();
 		runableTask2 object2 = new runableTask2();
 		Thread thread1 = new Thread(mainThread.getThreadGroup(),object1,"Thread1");
 		Thread thread2 = new Thread(mainThread.getThreadGroup(),new runableTask2(),"Thread2");
 		Thread thread3 = new Thread(mainThread.getThreadGroup(),new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Task3");
				
			}
		} ,"Thread3");
 		thread1.start();
 		thread2.start();
 		thread3.start();
 		 
		mainThread.getThreadGroup().list();
		 
	}
}

class runableTask1 implements Runnable{

	@Override
	public void run() {
		// the task your thread will do
		int [] array = new int [100];
		for (int i = 0 ; i<100;i++) {
			array[i]=i;
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


class runableTask2 implements Runnable{

	@Override
	public void run() {
		// the task your thread will do
		 
		System.out.println("Task2");
	}
	
}
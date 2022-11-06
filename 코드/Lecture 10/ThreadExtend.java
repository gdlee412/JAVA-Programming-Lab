
public class ThreadExtend {

	public static void main(String[] args) {
		task1 object = new task1();
		object.start();

	}

}

class task1 extends Thread {
	@Override
	public void run() {
		System.out.println("Task1");
	}
}
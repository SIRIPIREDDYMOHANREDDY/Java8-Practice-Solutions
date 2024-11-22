package features18;

//second approach
public class ThreadDemo2 {
	public static void main(String[] args) {

		Runnable r = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i <= 10; i++) {
					System.out.println(i);
				}

			}
		};
		Thread t = new Thread(r);
		t.start();
	}
}

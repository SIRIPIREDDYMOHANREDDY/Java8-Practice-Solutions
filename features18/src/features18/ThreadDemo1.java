package features18;
//Approach1 
public class ThreadDemo1  implements  Runnable{

	@Override
	public void run() {
		for(int i =0;i<=5;i++) {
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
    
		ThreadDemo1 td = new ThreadDemo1();
		Thread t1 = new Thread(td);
		t1.start();
	}

}

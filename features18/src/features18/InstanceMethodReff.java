package features18;

public class InstanceMethodReff {

	public void m1() {
	for(int i =1;i<=5;i++) {
		System.out.println(i);
	}
}
	public static void main(String[] args) {
	InstanceMethodReff	 m = new InstanceMethodReff();

	Runnable r = m ::m1;
	
	Thread t = new Thread(r);
	t.start();
			

	
	}
}

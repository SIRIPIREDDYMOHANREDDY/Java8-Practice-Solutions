package features18;

interface Vehicle{
	public void start();
	public default void clean() {  //Backward compatibility
		System.out.println("cleaning completed...");
	}
	public static void clean1() { 
		System.out.println("cleaning1 completed...");
	}
}



public class Car  implements Vehicle{
	@Override
	public void clean() {
		System.out.println("my clean method....");
	}
	@Override
	public void start() {
		System.out.println("car start..");

	}
	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.clean();
		Vehicle.clean1();
	}

}

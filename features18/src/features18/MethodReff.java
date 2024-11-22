package features18;



interface MyInterface{
	public void m1();
}

public class MethodReff {

	public static void m2() {
		System.out.println("this is m2() method");
	}

	public static void main(String[] args) {
		MyInterface m1= MethodReff::m2;
		m1.m1();




	}

}



//Consumer<String> consumer =(msg)  -> System.out.println(msg);
//consumer.accept("Hii");
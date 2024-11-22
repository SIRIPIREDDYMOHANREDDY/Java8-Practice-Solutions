package features18;


interface MyInterfaceTwo{
	public void m1();
}
public class MyAppTwo {
public static void main(String[] args) {
	MyInterfaceTwo m = () -> System.out.println("m1 method called...");
	m.m1();
}

}

package features18;


interface MyInterfaceOne{
	public void m1();
}
public class MyAppOne implements MyInterfaceOne  {

	@Override
	public void m1() {
		System.out.println("m1 method calling...");
		
	}
	public static void main(String[] args) {
		MyAppOne mao = new MyAppOne();
		mao.m1();
	}
	

}

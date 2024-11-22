package features18;


import java.util.function.Supplier;

public class ConstructorReff {
	public static void main(String[] args) {
		//Doctor d = new Doctor();
		
		Supplier<Doctor> s =Doctor::new;
		 System.out.println(s.get().hashCode());
		
	}
}


class Doctor{
	public Doctor() {
		System.out.println("doctor constructor ");
	}
}
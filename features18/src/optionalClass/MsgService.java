package optionalClass;

import java.util.Optional;
import java.util.Scanner;

public class MsgService {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter User id");
		int  userId = s.nextInt();


		User u = new User();
		//String userName=u.getUsernameById(userId); 


		//		String msg = userName.toUpperCase()+ ", Hello";
		//		System.out.println(msg);    null pointer Exception  when userName not there 

		//if(userName != null) {
			//String msg = userName.toUpperCase()+ ", Hello";
			//System.out.println(msg);
		//}
		//else {
			//System.out.println("Invalid Id");
		//}
		
		Optional<String> userName = u.getUsernameById(userId);
		if(userName.isPresent()) {
			String name = userName.get();
			System.out.println(name.toUpperCase()+", Hello");
			
		}
		else {
			System.out.println("No Data Found");
		}
	}

}

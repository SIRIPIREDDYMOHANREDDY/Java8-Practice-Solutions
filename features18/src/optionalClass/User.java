package optionalClass;

import java.util.Optional;

public class User {

	
	
//	public String getUsernameById(Integer id) {
//		if(id == 100) {
//			return "Raju";
//		}
//		else if(id == 101) {
//			return "Rani";
//		}
//		else if(id ==102) {
//			return  "john" ;
//		}
//		else {
//			return null;
//		}
	public Optional<String> getUsernameById(Integer id) {
		String name= null;
		if(id == 100) {
			name = "Raju";
		}
		else if(id == 101) {
			name = "Rani";
		}
		else if(id ==102) {
			name =  "john" ;
		}
			return Optional.ofNullable(name);
		}
	}


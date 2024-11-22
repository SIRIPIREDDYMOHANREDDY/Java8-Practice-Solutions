package base64Changes;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {
	public static void main(String[] args) throws NoSuchAlgorithmException {
		String pwd ="Mohan@0123";
	Encoder encoder =	Base64.getEncoder();
	
	// converting string to byte[] and passing as input for encode() method
	byte[] encode= encoder.encode(pwd.getBytes());
	

	//converting byte[] to string
	String encodedpwd = new String(encode);
	System.out.println(encodedpwd);
	
	System.out.println("===============================");
	
	Decoder decoder = Base64.getDecoder();
	byte[] decode = decoder.decode(encodedpwd);
	String decodedpwd = new String(decode);
	System.out.println(decodedpwd);
	
	System.out.println("=================================");
	// Encryption
	String pwd1 ="Mohan@0123";
	MessageDigest md = MessageDigest.getInstance("SHA-256");
	byte[] digest = md.digest(pwd1.getBytes());
	String encrypted = new String(digest);
	System.out.println("Encripted :: "+encrypted);
	
  Encoder encoder1 = Base64.getEncoder();
  byte[] encode1=encoder1.encode(digest);
  System.out.println("Encripted + Encoded ::" + new String(encode));
	
	}

}

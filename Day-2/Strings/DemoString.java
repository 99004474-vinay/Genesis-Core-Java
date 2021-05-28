import java.io.*;
public class DemoString {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String Fname;
		String Lname;
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		Fname=sc.readLine();
		Lname=sc.readLine();
		System.out.println(Fname.toLowerCase()+" "+Lname.toUpperCase());
	}

}

import java.io.*;
import java.util.*;

public class ListQ3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> s12=new ArrayList<String>();
		ArrayList<String> s13=new ArrayList<String>();
		System.out.println("Enter the top 5 scorers of IPL Season 13");
		for(int i=0;i<5;i++)
		{
			s13.add(br.readLine());
		}
		
		System.out.println("Enter the top 5 scorers of IPL Season 12");
		for(int i=0;i<5;i++)
		{
			s12.add(br.readLine());
		}
		
		s13.retainAll(s12);
		System.out.println("Consistent run scorers");
		for(String str:s13)
		{
		System.out.println(str);
		}
	}

}

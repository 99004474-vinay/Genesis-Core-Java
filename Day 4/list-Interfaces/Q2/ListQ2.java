import java.util.*;
import java.io.*;
public class ListQ2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> arr=new ArrayList<String>();
		for(int i=0;i<5;i++)
		{
			arr.add(br.readLine());
		}
		System.out.println("Enter Swap Positions:");
		int s1=Integer.parseInt(br.readLine());
		int s2=Integer.parseInt(br.readLine());
		
		Collections.swap(arr, s1-1, s2-1);
		for(String str:arr)
		{
			System.out.println(str);
		}
	}

}

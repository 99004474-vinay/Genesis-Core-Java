import java.io.*;
import java.util.*;
public class ListQ4 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arr=new ArrayList<Integer>();
		int n=Integer.parseInt(br.readLine());
		int century=0;
		int halfCentury=0;
		for(int i=0;i<n;i++)
		{
			arr.add(Integer.parseInt(br.readLine()));
			if(arr.get(i)>=100)
			{
				century+=1;
			}
			else if(arr.get(i)>=50)
			{
				halfCentury++;
			}
		}
		System.out.println(halfCentury);
		System.out.println(century);
	}

}

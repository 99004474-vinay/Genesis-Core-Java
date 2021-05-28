import java.io.*;
public class DemoString2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String p1=br.readLine();
		String p2=br.readLine();
		String[] player1=p1.split(" ");
		String[] player2=p2.split(" ");
		if(player1[1].equalsIgnoreCase(player2[1]))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");			
		}
		
	}

}

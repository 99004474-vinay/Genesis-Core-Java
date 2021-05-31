import java.util.ArrayList;
import java.io.*;
public class Player {
	public static void main(String[] args) throws IOException
	{
		ArrayList ar=new ArrayList();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Player Details");
		System.out.println("Enter Player Name:");
		String name=br.readLine();
		ar.add(name);
		System.out.println("Enter Age:");
		int age=Integer.parseInt(br.readLine());
		ar.add(age);
		System.out.println("Enter PLayer's country:");
		String country=br.readLine();
		ar.add(country);
		System.out.println("Player Details:");
		System.out.println(ar.get(0));
		System.out.println(ar.get(1));
		System.out.println(ar.get(2));
		
		System.out.println("Enter Skill");
		String skill=br.readLine();
		System.out.println("Enter the position to add the skill");
		int pos=Integer.parseInt(br.readLine());
		ar.set(pos,skill);
		
		System.out.println("Player Details:");
		System.out.println(ar.get(0));
		System.out.println(ar.get(1));
		System.out.println(ar.get(2));
		
		System.out.println("Enter the position of the detail to be removed");
		int del=Integer.parseInt(br.readLine());
		ar.remove(del);
		
		System.out.println("Player Details:");
		System.out.println(ar.get(0));
		System.out.println(ar.get(1));
		
		
		
		
	}
}

import java.io.*;
public class MatchMain {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.ODI\n2.Test\n3.T20");
		int ch=Integer.parseInt(br.readLine());
		switch(ch)
		{
		case 1: System.out.println("Enter Current Score:");
				int score=Integer.parseInt(br.readLine());
				ODI o=new ODI();
				o.setCurrentscore(score);
				System.out.println("Enter Current over:");
				float over=Integer.parseInt(br.readLine());
				o.setCurrentover(over);
				System.out.println("Enter Target Score:");
				int tar=Integer.parseInt(br.readLine());
				o.setTarget(tar);
				System.out.println("Requirments:");
				o.display(o.calculateRunRate(),o.calculateBalls());
				break;
		case 2: System.out.println("Enter Current Score:");
				int score1=Integer.parseInt(br.readLine());
				Test t=new Test();
				t.setCurrentscore(score1);
				System.out.println("Enter Current over:");
				float over1=Integer.parseInt(br.readLine());
				t.setCurrentover(over1);
				System.out.println("Enter Target Score:");
				int tar1=Integer.parseInt(br.readLine());
				t.setTarget(tar1);
				System.out.println("Requirments:");
				t.display(t.calculateRunRate(),t.calculateBalls());
				break;
		case 3:  System.out.println("Enter Current Score:");
				    int score2=Integer.parseInt(br.readLine());
					T20 t1=new T20();
					t1.setCurrentscore(score2);
					System.out.println("Enter Current over:");
					float over2=Integer.parseInt(br.readLine());
					t1.setCurrentover(over2);
					System.out.println("Enter Target Score:");
					int tar2=Integer.parseInt(br.readLine());
					t1.setTarget(tar2);
					System.out.println("Requirments:");
					t1.display(t1.calculateRunRate(),t1.calculateBalls());
					break;
		}
	}

}

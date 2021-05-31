import java.io.*;
public class ShapeMain {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Circle\nSquare\n");
		System.out.println("Enter the shape");
		String shape=br.readLine();
		if(shape.equals("Circle"))
		{
			System.out.println("Enter Radius");
			int r=Integer.parseInt(br.readLine());
			Circle c=new Circle();
			c.calArea(r);
		}
		else if(shape.equals("Square"))
		{
			System.out.println("Enter Side");
			int s=Integer.parseInt(br.readLine());
			Square sq=new Square();
			sq.calArea(s);
		}
	}

}

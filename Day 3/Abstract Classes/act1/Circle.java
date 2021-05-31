
public class Circle extends Shape {
	public void calArea(int value)
	{
		//DecimalFormat f = new DecimalFormat(".2f");
		double d=Math.floor((double)(Math.PI)*(value)*(value));
		System.out.println(String.format("%.2f",d));
	}
}

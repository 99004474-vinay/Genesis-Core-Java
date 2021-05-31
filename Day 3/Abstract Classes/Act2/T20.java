
public class T20 extends Match{
	float calculateRunRate()
	{
		return (getTarget()-getCurrentscore())/(20-getCurrentover());
	}

	@Override
	int calculateBalls() {
		// TODO Auto-generated method stub
		return (20-(int)getCurrentover())*6;
	}

	@Override
	void display(double reqRunrate, int balls) {
		// TODO Auto-generated method stub
		System.out.println("Need "+(getTarget()-getCurrentscore())+" in"+balls);
		System.out.println("Required RunRate:"+reqRunrate);
	}
}

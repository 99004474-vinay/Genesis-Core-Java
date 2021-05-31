
public class Test extends Match{
	float calculateRunRate()
	{
		return (getTarget()-getCurrentscore())/(90-getCurrentover());
	}

	@Override
	int calculateBalls() {
		// TODO Auto-generated method stub
		return (90-(int)getCurrentover())*6;
	}

	@Override
	void display(double reqRunrate, int balls) {
		// TODO Auto-generated method stub
		System.out.println("Need "+(getTarget()-getCurrentscore())+" in"+balls);
		System.out.println("Required RunRate:"+reqRunrate);
	}
}


public class SuitRoom extends HotelRoom{
	private int ratePerSqft;
	public SuitRoom(String hotelName, int noOfSqft, boolean hasTv, boolean hasWifi) {
		// TODO Auto-generated constructor stub
		super(hotelName,noOfSqft,hasTv,hasWifi);
		setRatePerSqft(15);
		
	}
	/**
	 * @return the ratePerSqft
	 */
	public int getRatePerSqft() {
		return ratePerSqft;
	}
	/**
	 * @param ratePerSqft the ratePerSqft to set
	 */
	public void setRatePerSqft(int ratePerSqft) {
		this.ratePerSqft = ratePerSqft;
		if(this.isHasWifi())
		{
			this.ratePerSqft+=2;
		}
	}
	
	public int getratePerSqft()
	{
		return this.ratePerSqft;
	}
	public int calculateTarrif()
	{
		System.out.println(this.ratePerSqft+" "+this.getNoOfSqft());
		return this.ratePerSqft*this.getNoOfSqft();
	}
}

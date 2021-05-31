
public class TwoWheeler extends Vehicle {
	
	private String kickStart;
	public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc,String kickStart)
	{
		super(make,vehicleNumber,fuelType,fuelCapacity,cc);
		this.kickStart=kickStart;
	}
	/**
	 * @return the kickStart
	 */
	public String getKickStart() {
		return kickStart;
	}

	/**
	 * @param kickStart the kickStart to set
	 */
	public void setKickStart(String kickStart) {
		this.kickStart = kickStart;
	}

	public void displayDetaiInfo()
	{
		System.out.println("Kick Start available(yes/no):"+kickStart);
	}
    
}

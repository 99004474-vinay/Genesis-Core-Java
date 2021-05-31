
public class FourWheeler extends Vehicle {
	private String audioSystem;
	private int numberOfDoors;
	public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc,String audioSystem,int numberOfDoors) {
		// TODO Auto-generated constructor stub
		super(make,vehicleNumber,fuelType,fuelCapacity,cc);
		this.audioSystem=audioSystem;
		this.numberOfDoors=numberOfDoors;
	}
	
    /**
	 * @return the audioSystem
	 */
	public String getAudioSystem() {
		return audioSystem;
	}

	/**
	 * @param audioSystem the audioSystem to set
	 */
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}

	/**
	 * @return the numberOfDoors
	 */
	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	/**
	 * @param numberOfDoors the numberOfDoors to set
	 */
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public void displayDetailInfo()
    {
    	System.out.println("Audio System:"+audioSystem);
    	System.out.println("Number of Doors:"+numberOfDoors);
    }
}

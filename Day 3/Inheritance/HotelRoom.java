
public class HotelRoom {
	private String hotelName;
	private int noOfSqft;
	private boolean hasTv;
	private boolean hasWifi;
	
	
	
	public HotelRoom(String hotelName, int noOfSqft, boolean hasTv, boolean hasWifi) {
		super();
		this.hotelName = hotelName;
		this.noOfSqft = noOfSqft;
		this.hasTv = hasTv;
		this.hasWifi = hasWifi;
	}
	/**
	 * @return the hotelName
	 */
	public String getHotelName() {
		return hotelName;
	}
	/**
	 * @param hotelName the hotelName to set
	 */
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	/**
	 * @return the noOfSqft
	 */
	public int getNoOfSqft() {
		return noOfSqft;
	}
	/**
	 * @param noOfSqft the noOfSqft to set
	 */
	public void setNoOfSqft(int noOfSqft) {
		this.noOfSqft = noOfSqft;
	}
	/**
	 * @return the hasTv
	 */
	public boolean isHasTv() {
		return hasTv;
	}
	/**
	 * @param hasTv the hasTv to set
	 */
	public void setHasTv(boolean hasTv) {
		this.hasTv = hasTv;
	}
	/**
	 * @return the hasWifi
	 */
	public boolean isHasWifi() {
		return hasWifi;
	}
	/**
	 * @param hasWifi the hasWifi to set
	 */
	public void setHasWifi(boolean hasWifi) {
		this.hasWifi = hasWifi;
	}
	
	
	public int calculateTarrif()
	{
		return 0;
	}
	public int getratePerSqft()
	{
	   return 0;
	}
}

public class Airport {

	String airportID = "";
	double latitude = 0.0;
	double longitude = 0.0;
	
	public Airport(String airportID, double latitude, double longitude) {
		super();
		this.airportID = airportID;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getAirportID() {
		return airportID;
	}

	public void setAirportID(String airportID) {
		this.airportID = airportID;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
}

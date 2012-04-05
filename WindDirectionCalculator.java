public class WindDirectionCalculator {

	public static double calculateWindDirection(String gSpeed, String airSpeed, String course, String heading) {
		
		//Declared variables to complete calculation
		double planeGroundSpeed = 0.0;
		double planeAirspeed = 0.0;
		double planeCourse = 0.0;
		double planeHeading = 0.0;
		double windDirection = 0.0;
		
		planeGroundSpeed = Double.parseDouble(gSpeed);
		planeAirspeed = Double.parseDouble(airSpeed);
		planeCourse = Double.parseDouble(course);
		planeHeading = Double.parseDouble(heading);
		
		//These are defining the vertical and horizontal components of the ground speed and airspeed
		double GSH = (Math.sin(Math.toRadians((planeCourse%360))))*planeGroundSpeed;
		double GSV = (Math.cos(Math.toRadians((planeCourse%360))))*planeGroundSpeed;
		double TASH = (Math.sin(Math.toRadians((planeHeading%360))))*planeAirspeed;
		double TASV = (Math.cos(Math.toRadians((planeHeading%360))))*planeAirspeed;
		double DeltaH = TASH - GSH;
		double DeltaV = TASV - GSV;
		
		//This will determine the wind direction relative to the plane
		if(DeltaV>0)
		windDirection = Math.ceil((Math.toDegrees(Math.atan(DeltaH/DeltaV)))%360);
		else
		windDirection = Math.ceil((Math.toDegrees(Math.atan(DeltaH/DeltaV))+180)%360);
				
		return windDirection;
	}
	
}

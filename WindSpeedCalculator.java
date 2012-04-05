import java.lang.Math;
public class WindSpeedCalculator {
	
	
	//The formula is the same for each unit as long as the units entered are the same
	public static double calculateWindSpeed(String gSpeed, String airSpeed, String course, String heading) {
		
		
		//Declared variables to complete calculation
		double planeGroundSpeed = 0.0;
		double planeAirspeed = 0.0;
		double planeCourse = 0.0;
		double planeHeading = 0.0;
		double windSpeed = 0.0;
		
		planeGroundSpeed = Double.parseDouble(gSpeed);
		planeAirspeed = Double.parseDouble(airSpeed);
		planeCourse = Double.parseDouble(course);
		planeHeading = Double.parseDouble(heading);
		
		//This will determine the wind speed relative to the plane
		windSpeed = Math.ceil((Math.sqrt((Math.pow(((Math.sin(Math.toRadians(planeHeading%360))*planeAirspeed)-(Math.sin(Math.toRadians(planeCourse%360))*planeGroundSpeed)), 2.0))+(Math.pow(((Math.cos(Math.toRadians(planeHeading%360))*planeAirspeed)-(Math.cos(Math.toRadians(planeCourse%360))*planeGroundSpeed)), 2.0)))));
		
		return windSpeed;
	}
	
}

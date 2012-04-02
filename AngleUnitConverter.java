
public class AngleUnitConverter {
	
	public static double convertFromDegreesToRadians(String input) {

		double initialValue = 0.0;
		double finalValue = 0.0;
		double conversionFactor = Math.PI/360;

		initialValue = Double.parseDouble(input);

		finalValue = initialValue * conversionFactor; 

		return finalValue;
	}

	public static double convertFromRadiansToDegrees(String input) {

		double initialValue = 0.0;
		double finalValue = 0.0;
		double conversionFactor = 360/Math.PI;

		initialValue = Double.parseDouble(input);

		finalValue = initialValue * conversionFactor; 

		return finalValue;
	}

}

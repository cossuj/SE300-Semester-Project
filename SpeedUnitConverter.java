
public class SpeedUnitConverter {

	public static double convertFromMphToKnots(String input) {
		
		double initialValue = 0.0;
		double finalValue = 0.0;
		double conversionFactor = 0.868976242;
		
		initialValue = Double.parseDouble(input);
		
		finalValue = initialValue * conversionFactor; 
		
		return finalValue;
	}
	
	public static double convertFromMphToKph(String input) {
		
		double initialValue = 0.0;
		double finalValue = 0.0;
		double conversionFactor = 1.609344;
		
		initialValue = Double.parseDouble(input);
		
		finalValue = initialValue * conversionFactor; 
		
		return finalValue;
	}
	
	public static double convertFromKnotsToMph(String input) {
		
		double initialValue = 0.0;
		double finalValue = 0.0;
		double conversionFactor = 1.15077945;
		
		initialValue = Double.parseDouble(input);
		
		finalValue = initialValue * conversionFactor; 
		
		return finalValue;
	}
	
	public static double convertFromKnotsToKph(String input) {
		
		double initialValue = 0.0;
		double finalValue = 0.0;
		double conversionFactor = 1.85200;
		
		initialValue = Double.parseDouble(input);
		
		finalValue = initialValue * conversionFactor; 
		
		return finalValue;
	}
	
	public static double convertFromKphToMph(String input) {
		
		double initialValue = 0.0;
		double finalValue = 0.0;
		double conversionFactor = 0.621371192;
		
		initialValue = Double.parseDouble(input);
		
		finalValue = initialValue * conversionFactor; 
		
		return finalValue;
	}
	
	public static double convertFromKphToKnots(String input) {
		
		double initialValue = 0.0;
		double finalValue = 0.0;
		double conversionFactor = 0.539956803;
		
		initialValue = Double.parseDouble(input);
		
		finalValue = initialValue * conversionFactor; 
		
		return finalValue;
	}
}

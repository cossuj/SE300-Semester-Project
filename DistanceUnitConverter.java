
public class DistanceUnitConverter {

	public static double convertFromStatueMilesToNauticalMiles(String input) {
		
		double initialValue = 0.0;
		double finalValue = 0.0;
		double conversionFactor = 0.868976242;
		
		initialValue = Double.parseDouble(input);
		
		finalValue = initialValue * conversionFactor; 
		
		return finalValue;
	}
	
	public static double convertFromStatueMilesToKilometers(String input) {
		
		double initialValue = 0.0;
		double finalValue = 0.0;
		double conversionFactor = 1.609344;
		
		initialValue = Double.parseDouble(input);
		
		finalValue = initialValue * conversionFactor; 
		
		return finalValue;
	}
	
	public static double convertFromNauticalMilesToStatueMiles(String input) {
		
		double initialValue = 0.0;
		double finalValue = 0.0;
		double conversionFactor = 1.15077945;
		
		initialValue = Double.parseDouble(input);
		
		finalValue = initialValue * conversionFactor; 
		
		return finalValue;
	}
	
	public static double convertFromNauticalMilesToKilometers(String input) {
		
		double initialValue = 0.0;
		double finalValue = 0.0;
		double conversionFactor = 1.85200;
		
		initialValue = Double.parseDouble(input);
		
		finalValue = initialValue * conversionFactor; 
		
		return finalValue;
	}
	
	public static double convertFromKilometersToStatueMiles(String input) {
		
		double initialValue = 0.0;
		double finalValue = 0.0;
		double conversionFactor = 0.621371192;
		
		initialValue = Double.parseDouble(input);
		
		finalValue = initialValue * conversionFactor;
		
		return finalValue;
	}
	
	public static double convertFromKilometersToNauticalMiles(String input) {
		
		double initialValue = 0.0;
		double finalValue = 0.0;
		double conversionFactor = 0.539956803;
		
		initialValue = Double.parseDouble(input);
		
		finalValue = initialValue * conversionFactor; 
		
		return finalValue;
	}
}

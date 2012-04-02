
public class TempuratureUnitConverter {

	public static double convertFromCelsiusToFahrenheit(String input) {
		
		double initialValue = 0.0;
		double finalValue = 0.0;
		double conversionFactor = 1.8;
		
		initialValue = Double.parseDouble(input);
		
		finalValue = initialValue * conversionFactor + 32; 
		
		return finalValue;
	}
	
	public static double convertFromCelsiusToKelvin(String input) {
		
		double initialValue = 0.0;
		double finalValue = 0.0;
		double conversionFactor = 1.0;
		
		initialValue = Double.parseDouble(input);
		
		finalValue = initialValue * conversionFactor + 273.15; 
		
		return finalValue;
	}
	
	public static double convertFromCelsiusToRankin(String input) {
		
		double initialValue = 0.0;
		double finalValue = 0.0;
		double conversionFactor = 1.8;
		
		initialValue = Double.parseDouble(input);
		
		finalValue = initialValue * conversionFactor + 32 + 459.67; 
		
		return finalValue;
	}
	
	public static double convertFromFahrenheitToCelsius(String input) {
		
		double initialValue = 0.0;
		double finalValue = 0.0;
		double conversionFactor = 1.8;
		
		initialValue = Double.parseDouble(input);
		
		finalValue = (initialValue - 32) * conversionFactor; 
		
		return finalValue;
	}
	
	public static double convertFromFahrenheitToKelvin(String input) {
		
		double initialValue = 0.0;
		double finalValue = 0.0;
		double conversionFactor = 1.8;
		
		initialValue = Double.parseDouble(input);
		
		finalValue = (initialValue + 459.67) / conversionFactor;
		
		return finalValue;
	}
	
	public static double convertFromFahrenheitToRankin(String input) {
		
		double initialValue = 0.0;
		double finalValue = 0.0;
		double conversionFactor = 1.0;
		
		initialValue = Double.parseDouble(input);
		
		finalValue = initialValue * conversionFactor + 459.67; 
		
		return finalValue;
	}

        public static double convertFromKelvinToCelsius(String input) {
		
		double initialValue = 0.0;
		double finalValue = 0.0;
		double conversionFactor = 1.0;
		
		initialValue = Double.parseDouble(input);
		
		finalValue = initialValue * conversionFactor - 273.15; 
		
		return finalValue;
	}

        public static double convertFromKelvinToFahrenheit(String input) {
		
		double initialValue = 0.0;
		double finalValue = 0.0;
		double conversionFactor = 1.8;
		
		initialValue = Double.parseDouble(input);
		
		finalValue = initialValue * conversionFactor - 459.67; 
		
		return finalValue;
	}

        public static double convertFromKelvinToRankin(String input) {
		
		double initialValue = 0.0;
		double finalValue = 0.0;
		double conversionFactor = 1.8;
		
		initialValue = Double.parseDouble(input);
		
		finalValue = initialValue * conversionFactor; 
		
		return finalValue;
	}

        public static double convertFromRankinToCelsius(String input) {
		
		double initialValue = 0.0;
		double finalValue = 0.0;
		double conversionFactor = 1.8;
		
		initialValue = Double.parseDouble(input);
		
		finalValue = (initialValue - 32 - 459.67) / conversionFactor; 
		
		return finalValue;
	}

        public static double convertFromRankinToFahrenheit(String input) {
		
		double initialValue = 0.0;
		double finalValue = 0.0;
		double conversionFactor = 1.0;
		
		initialValue = Double.parseDouble(input);
		
		finalValue = initialValue * conversionFactor - 459.67; 
		
		return finalValue;
	}

        public static double convertFromRankinToKelvin(String input) {
		
		double initialValue = 0.0;
		double finalValue = 0.0;
		double conversionFactor = 1.8;
		
		initialValue = Double.parseDouble(input);
		
		finalValue = initialValue / conversionFactor; 
		
		return finalValue;
	}
}

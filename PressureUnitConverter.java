
public class PressureUnitConverter {

	public static double convertFromMillibarsToInchesMercury(String input) {

		double initialValue = 0.0;
		double finalValue = 0.0;
		double conversionFactor = 0.0295333727;

		initialValue = Double.parseDouble(input);

		finalValue = initialValue * conversionFactor; 

		return finalValue;
	}

	public static double convertFromInchesMercuryToMillibars(String input) {

		double initialValue = 0.0;
		double finalValue = 0.0;
		double conversionFactor = 33.86;

		initialValue = Double.parseDouble(input);

		finalValue = initialValue * conversionFactor; 

		return finalValue;
	}

}

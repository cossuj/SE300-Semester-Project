import javax.swing.JOptionPane;

public class TesterClass {

	public static void main(String[] args) {

		// Test
		
		// Input
		String input = "";
		input = JOptionPane.showInputDialog("Enter a value:");
		System.out.println("Input = " + input);

		// Distance Conversions
		System.out.println("\nDistance Conversions");
		System.out.println("SM to NM = " + DistanceUnitConverter.convertFromStatueMilesToNauticalMiles(input));
		System.out.println("SM to KM = " + DistanceUnitConverter.convertFromStatueMilesToKilometers(input));
		System.out.println("NM to SM = " + DistanceUnitConverter.convertFromNauticalMilesToStatueMiles(input));
		System.out.println("NM to KM = " + DistanceUnitConverter.convertFromNauticalMilesToKilometers(input));
		System.out.println("KM to SM = " + DistanceUnitConverter.convertFromKilometersToStatueMiles(input));
		System.out.println("KM to NM = " + DistanceUnitConverter.convertFromKilometersToNauticalMiles(input));

		// Speed Conversions
		System.out.println("\nSpeed Conversions");
		System.out.println("Mph to Knots = " + SpeedUnitConverter.convertFromMphToKnots(input));
		System.out.println("Mph to Kph = " + SpeedUnitConverter.convertFromMphToKph(input));
		System.out.println("Knots to Mph = " + SpeedUnitConverter.convertFromKnotsToMph(input));
		System.out.println("Knots to Kph = " + SpeedUnitConverter.convertFromKnotsToKph(input));
		System.out.println("Kph to Mph = " + SpeedUnitConverter.convertFromKphToMph(input));
		System.out.println("Kph to Knots = " + SpeedUnitConverter.convertFromKphToKnots(input));

		// Temperature Conversions
		System.out.println("\nTemperature Conversions");
		System.out.println("Celsius to Fahrenheit = " + TempuratureUnitConverter.convertFromCelsiusToFahrenheit(input));
		System.out.println("Celsius to Kelvin = " + TempuratureUnitConverter.convertFromCelsiusToKelvin(input));
		System.out.println("Celsius to Rankin = " + TempuratureUnitConverter.convertFromCelsiusToRankin(input));
		System.out.println("Fahrenheit to Celsius = " + TempuratureUnitConverter.convertFromFahrenheitToCelsius(input));
		System.out.println("Fahrenheit to Kelvin = " + TempuratureUnitConverter.convertFromFahrenheitToKelvin(input));
		System.out.println("Fahrenheit to Rankin = " + TempuratureUnitConverter.convertFromFahrenheitToRankin(input));
		System.out.println("Kelvin to Celsius = " + TempuratureUnitConverter.convertFromKelvinToCelsius(input));
		System.out.println("Kelvin to Fahrenheit = " + TempuratureUnitConverter.convertFromKelvinToFahrenheit(input));
		System.out.println("Kelvin to Rankin = " + TempuratureUnitConverter.convertFromKelvinToRankin(input));
		System.out.println("Rankin to Celsius = " + TempuratureUnitConverter.convertFromRankinToCelsius(input));
		System.out.println("Rankin to Fahrenheit = " + TempuratureUnitConverter.convertFromRankinToFahrenheit(input));
		System.out.println("Rankin to Kelvin = " + TempuratureUnitConverter.convertFromRankinToKelvin(input));

		// Angle Conversions
		System.out.println("\nAngle Conversions");
		System.out.println("Degrees to Radians = " + AngleUnitConverter.convertFromDegreesToRadians(input));
		System.out.println("Radians to Degrees = " + AngleUnitConverter.convertFromRadiansToDegrees(input));

		// Pressure Conversions
		System.out.println("\nPressure Conversions");
		System.out.println("Inches Mercury to Millibars = " + PressureUnitConverter.convertFromInchesMercuryToMillibars(input));
		System.out.println("Millibars to Inches Mercury = " + PressureUnitConverter.convertFromMillibarsToInchesMercury(input));
	}
}
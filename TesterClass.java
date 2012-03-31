import javax.swing.JOptionPane;

public class TesterClass {
	
	public static void main(String[] args) {
		
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
		
		
		// Angle Conversions
		
		
		// Pressure Conversions
		
	}
}
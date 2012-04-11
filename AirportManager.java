import java.io.*;
import java.util.*;


public  class AirportManager {
	
	private static Scanner x;
	int i = 0;
	// created an array of airport objects to save airports to:
	AirportList airportList = new AirportList();
	String[] threeLetterCode = new String[50];
	Double[] latitude = new Double[50];
	Double[] longitude = new Double[50];
	
	public void loadDataFromFile(){
		try{
			x = new Scanner(new File("airportData.txt"));
		}
		catch(Exception e){
			System.out.println("File could not be found!");
		}
	}
	
	public void readDataFromFile(){
		while (x.hasNext()){
			String a = x.next();
			String b = x.next();
			String c = x.next();
			
			//Create a new airport object
			Airport y = new Airport(a, Double.parseDouble(b), Double.parseDouble(c));
			
			threeLetterCode[i] = a;
			latitude[i]=Double.parseDouble(b);
			longitude[i]=Double.parseDouble(c);
		
			System.out.printf("Airport "+i+":\t"+ threeLetterCode[i]+"  "+latitude[i]+"  "+longitude[i]+"\n");
			i++;
		}
		double newLatitude = latitude[0] + latitude[1];
		System.out.println("the new latitude is: "+ newLatitude);
	}	
	public void closeDataFromFile(){
			x.close();
	}
}

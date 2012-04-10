import java.io.*;
import java.util.*;


public  class AirportManager {
	
	private static Scanner x;
	int i = 0;
	
	// created an array of airport objects to save airports to:
	public Airport[] airportList = new Airport[20];
	
	
	
	
	public  void loadDataFromFile(){
		try{
			x = new Scanner(new File("airportData.txt"));
		}
		catch(Exception e){
			System.out.println("File could not be found!");
		}
	}
	
	public  void readDataFromFile(){
		while (x.hasNext()){
			String a = x.next();
			String b = x.next();
			String c = x.next();
			
			//Create a new airport object
			Airport y = new Airport(a, Double.parseDouble(b), Double.parseDouble(c));
			
			//add airport object "y" to airportList array
			airportList[i].add(y);
			i++;
			//Stephen - I am not sure why this isn't working. I feel like everything is there but not sure.
			System.out.println(airportList);
			System.out.printf("The airport code is: %s\t%s\t%s\n",a,b,c);
		}
	}
	
	public void closeDataFromFile(){
			x.close();
	}
}

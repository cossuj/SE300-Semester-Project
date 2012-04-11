public class AirportList {
	public Airport[] list = new Airport[50];
	int i=0;
	
	public void add(Airport a){
		if(i<list.length){
			list[i]=a;
			System.out.printf("airport added at index: "+i+" and is "+ a);
		}
	}		
}

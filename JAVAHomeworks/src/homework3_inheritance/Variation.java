package homework3_inheritance;

public class Variation {

	public static class AirPlaneTicket {
		public String CalculateBasicFare(int Time, int Dist) { //this method calculates basic fare for airplane
			String Fare=String.valueOf(Dist/Time + 100);
			return Fare;			
		}
		
		public void printTicket(int Dist, int Time) {
			System.out.println("Distance to destination: "+Dist);
			System.out.println("Time to destination: "+Time);
			System.out.println("Fare is: "+CalculateBasicFare(Time, Dist));
		}
	}
	
	public static class TrainTicket extends AirPlaneTicket {
		
		@Override
		public String CalculateBasicFare(int Time, int Dist) { //this method calculates basic fare for airplane
			String Fare=String.valueOf(Dist/Time);
			return Fare;			
		}
	}
	
	public static void main(String[] args) {
		TrainTicket a = new TrainTicket();
		a.printTicket(100, 8);
	}
	
}

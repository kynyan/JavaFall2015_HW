package homework3_inheritance;

public class Specification {
	
	static abstract class PublicTransportTicket {
		
		public abstract void CalculateBasicFare(int Time, int Distance);
		//this method will calculate and print out a basic fare for a specific Transport			
	}
	
	static class AirPlaneTicket extends PublicTransportTicket {

		@Override
		public void CalculateBasicFare(int Time, int Distance) {
			String Fare=String.valueOf(Distance/Time + 100);
			System.out.println(Fare);			
		}

	}
	
	public static void main(String[] args) {
		AirPlaneTicket a = new AirPlaneTicket();
		a.CalculateBasicFare(1, 800);
	}
}

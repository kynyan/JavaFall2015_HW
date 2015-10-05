package homework3_inheritance;

public class Specialization {
	
	static class PublicTransportTicket {
		
		public void CalcultateBasicFare(int Time, int Distance) { //this method calculates and prints out a basic fare
			String Fare = String.valueOf(Distance/Time + 20);
			System.out.println(Fare);
			
		}
	}
	
	static class TrainTicket extends PublicTransportTicket {
		@Override
		public void CalcultateBasicFare(int Time, int Distance) { //this method overrides CalculateBasicFare by adding tax
			super.CalcultateBasicFare(Time, Distance);
			IncludeTaxes();
		}

		public void IncludeTaxes() {
			System.out.println("18% VAT included");
		}
	}
	
	public static void main(String[] args) {
		PublicTransportTicket a = new PublicTransportTicket();
		a.CalcultateBasicFare(5, 100);
		
		TrainTicket b = new TrainTicket();
		b.CalcultateBasicFare(5, 100);
	}
}

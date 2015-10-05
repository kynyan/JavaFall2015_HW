package homework3_inheritance;

public class Generalization {
	public static class SubUrbanTrainTicket {
		public void printTicket(int Dist, int Time) { //this method just prints out the distance and time to destination
			System.out.println("Distance to destination: "+Dist);
			System.out.println("Time to destination: "+Time);
		}
	}
	
	public static class TrainTicket extends SubUrbanTrainTicket {
		public void CalcultateBasicFare(int Dist, int Time) { //this method calculates and prints out a basic fare
			String Fare = String.valueOf(Dist/Time + 20);
			System.out.println("Fare is: "+Fare);
			
		}
		@Override
		public void printTicket(int Dist, int Time) { //this method adds fare to the train ticket 
			System.out.println("Distance to destination: "+Dist);
			System.out.println("Time to destination: "+Time);
			CalcultateBasicFare(Dist, Time);
		}
	}
	
	public static void main(String[] args) {
		SubUrbanTrainTicket a = new SubUrbanTrainTicket();
		a.printTicket(100, 5);
		TrainTicket b = new TrainTicket();
		b.printTicket(100, 5);
	}
}

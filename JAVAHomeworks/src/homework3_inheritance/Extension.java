package homework3_inheritance;

public class Extension {
	public static class Fridge {
		public void calculateEnergyConsumption(double Volume, double PowerDensity) {
			double Energy = PowerDensity*Volume;
			System.out.println("Enregy consumption is: "+Energy+" Watts");
		}
	}
	
	public static class FridgeWithDispenser extends Fridge {
		public void printWaterConsumption() {
			System.out.println("You can use water dispenser with a 1.5 liter tank");
		}
	}
}

package homework3_inheritance;

public class Restriction {
	public class TrafficViolationSolution {
		public void payFine() {
			System.out.println("you can pay a fine");
		}
		public void giveBribe() {
			System.out.println("you can give a bribe");
		}
		public void tryEscape() {
			System.out.println("you can try to run away");
		}
	}
	public class TrafficViolationSolutionInUSA extends TrafficViolationSolution {
		@Override
		public void giveBribe() {
			throw new UnsupportedOperationException();
		}
	}
}

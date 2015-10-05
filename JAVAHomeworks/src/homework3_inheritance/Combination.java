package homework3_inheritance;

import java.util.Date;
//multiple inheritance in JAVA can be done using interfaces
public class Combination { 
	
	public interface ID {
		void newID(String n, Date b);	
	}
	
	public interface ProtectedPaper {
		void paper(String w);
	}
	
	public static class Passport implements ID, ProtectedPaper { 

		@Override
		public void paper(String w) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void newID(String n, Date b) {
			// TODO Auto-generated method stub
			
		}
		
	}
}

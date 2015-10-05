package homework3_inheritance;

import java.util.HashMap;
import java.util.Map;

public class Construction {
	
	public static class PostIndex {
		
		Map<Integer, String> hashMap= new HashMap<Integer, String>();
		{
		hashMap.put(195000, "Post Office");
		hashMap.put(195100, "Police office");
		hashMap.put(195200, "City Hall");
		}
		
		public void SearchPostIndex(int i) {
			if (hashMap.containsKey(i)) {
				System.out.println(hashMap.get(i)); //print only indices
			}
		}
	}
	
	public static class BuildingInfo extends PostIndex {
		
		private static final String cityHall = "City Hall";
		
		public void AddCityHallInfo() {
			System.out.println("This building was completed in 1931");
		}
		
		public void PrintInfoGivenPostIndex(int i) {
			SearchPostIndex(i);
			if (hashMap.containsKey(i)) {
				if (hashMap.get(i).equals(cityHall)) {
					System.out.println("Building of the "+hashMap.get(i));
					AddCityHallInfo();
				} else {
					System.out.println("Building of the "+hashMap.get(i));
				}
			}
		}
	}
	
	public static void main(String[] args) {

		PostIndex a = new PostIndex();
		a.SearchPostIndex(195200);
		
		BuildingInfo b = new BuildingInfo();
		b.PrintInfoGivenPostIndex(195200);
		
	}
	
}

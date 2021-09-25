package colllections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Integer>   employees = new ArrayList<Integer>();
		//PriorityQueue<Integer> employees = new PriorityQueue<Integer>();
		//HashSet<Integer> employees = new HashSet<Integer>();
		//TreeSet<Integer> employees = new TreeSet<Integer>();
		
//		HashMap<String,String> produts = new HashMap<String,String>();
//		produts.put("OnePlus", "OnePlus9");
//		produts.put("iphone", "iphone11");
//		produts.put("iphone", "iphone12");
//		produts.put("OnePlus", "OnePlus8");
//		
//		System.out.println(produts.get("OnePlus"));
		
		HashMap<String, ArrayList<String>> mobiles = new HashMap<String, ArrayList<String>>();
		
		ArrayList<String> iphone = new ArrayList<String>();
		iphone.add("iphone11");
		iphone.add("iphone12");
		
		ArrayList<String> OnePlus = new ArrayList<String>();
		OnePlus.add("OnePlus8");
		OnePlus.add("OnePlus7");
		OnePlus.add("OnePlus9");
		
		mobiles.put("OnePlus", OnePlus);
		mobiles.put("iphone", iphone);
		
		for (String employee : mobiles.get("OnePlus")) {
			System.out.println(employee);
		}
		
		
	}

}

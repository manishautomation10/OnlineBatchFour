package colllections;

import java.util.HashSet;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Integer>   employees = new ArrayList<Integer>();
		//PriorityQueue<Integer> employees = new PriorityQueue<Integer>();
		//HashSet<Integer> employees = new HashSet<Integer>();
		TreeSet<Integer> employees = new TreeSet<Integer>();
		
		employees.add(10);
		employees.add(20);
		employees.add(40);
		employees.add(30);
		employees.add(10);
		employees.add(20);
		employees.add(40);
		
		for (Integer employee : employees) {
			System.out.println(employee);
		}
		
		employees.remove(10);
		System.out.println("================");
		for (Integer employee : employees) {
			System.out.println(employee);
		}
		employees.remove(100);
		System.out.println("================");
		for (Integer employee : employees) {
			System.out.println(employee);
		}
	}

}

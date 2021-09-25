package colllections;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Integer>   employees = new ArrayList<Integer>();
		PriorityQueue<Integer> employees = new PriorityQueue<Integer>();
		
		employees.add(10);
		employees.add(20);
		employees.add(40);
		employees.add(30);
		employees.add(10);
		employees.add(20);
		
		for (Integer employee : employees) {
			System.out.println(employee);
		}
		employees.remove();
		System.out.println("================");
		
		for (Integer employee : employees) {
			System.out.println(employee);
		}
		
		employees.remove();
		System.out.println("================");
		
		for (Integer employee : employees) {
			System.out.println(employee);
		}
	}

}

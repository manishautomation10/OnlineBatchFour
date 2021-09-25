package colllections;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> employees = new ArrayList<Integer>();
		employees.add(10);
		employees.add(20);
		employees.add(40);
		employees.add(30);
		employees.add(10);
		employees.add(20);
		
		System.out.println(employees.get(0));
		System.out.println(employees.get(1));
		System.out.println(employees.get(2));
		System.out.println(employees.get(3));
		System.out.println("================");
		
		for (Integer employee : employees) {
			System.out.println(employee);
		}
		System.out.println("================");
		employees.remove(2);
		for (Integer employee : employees) {
			System.out.println(employee);
		}
		
	}

}

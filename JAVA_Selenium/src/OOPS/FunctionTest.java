package OOPS;

public class FunctionTest {

	int no1, no2, result;
	
	
	
	public void addition() {
		System.out.println("=================");
		System.out.println(no1 + no2);
		System.out.println("=================");
	}
	
	public int addReturn() {
		int result  = no1 + no2;
		
		//return result;
		return no1 + no2;
	}
	
	public void addTwoNumbers(int a, int b) {
		System.out.println(a+b);
	}
	
	public FunctionTest() {
		System.out.println("in constructror");
		result = 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		
		FunctionTest add = new FunctionTest();
		add.no1 = 10;
		add.no2 = 20;
		
		add.addition();
		result = add.addReturn();
		System.out.println(result);
		add.addTwoNumbers(result,result);
		
		/*FunctionTest add1 = new FunctionTest();
		
		add1.no1 = 20;
		add1.no2 = 30;
		
		add1.addition();
		
		FunctionTest add2 = new FunctionTest();
		
		add2.no1 = 40;
		add2.no2 = 50;
		
		add2.addition();*/
	}

}


public class OperatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int c = 0;
		
		System.out.println("a " + a);
		System.out.println("b " + b);
		System.out.println("c " + c);
		System.out.println("**********************");
		c = a + b;
		System.out.println("c = " + c);
		System.out.println("**********************");
		
		c = a - b;
		System.out.println("c = " + c);
		System.out.println("**********************");
		c = a * b;
		System.out.println("c = " + c);
		System.out.println("**********************");
		
		c = a / b;
		System.out.println("c = " + c);
		System.out.println("**********************");
		System.out.println("**********Reelational************");
		//10 > 20
		System.out.println("10 < 20 " + (a < b) );
		System.out.println("10 > 20 " + (a > b) );
		System.out.println("20 > 20 " + (20 > 20) );
		System.out.println("20 >= 20 " + (20 >= 20) );
		System.out.println("10 <= 20 " + (a <= b) );
		
		System.out.println("**********Logical************");
		
		System.out.println("10 > 5 & 10 < 20 " + (10 > 5 && 10 < 20) );
		System.out.println("10 > 50 & 10 < 20 " + (10 > 50 && 10 < 20) );
		System.out.println("10 > 5 | 100 < 20 " + (10 > 5 || 100 < 20) );
		System.out.println("10 > 50 | 10 < 20 " + (10 > 50 || 10 < 20) );
		
		System.out.println("**********Conditional statement************");
		//10 < 20 
		if(a < b) {
			System.out.println("Hello Manish");
		}else {
			System.out.println("Hello Balaji");
		}
		
		if(10 > 5 || 100 < 20) {
			System.out.println("Hello Manish1");
		}else {
			System.out.println("Hello Balaji1");
		}
		
		if(5 > 10) {
			System.out.println("Hello Manish2");
		}else if (10 < 5) {
			System.out.println("Hello Sanket2");
		}else {
			System.out.println("Hello Balaji2");
		}
		
	}

}

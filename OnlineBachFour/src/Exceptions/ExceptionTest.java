package Exceptions;

public class ExceptionTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//try catch finally
		
		int a = 0, b = 20;
		float c = 0;
		
		int[] arrNum = new int[5];
		
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		
		c = a + b;
		
		Thread.sleep(100);
		
		System.out.println("C = " + c);
		try {
			
			if(a == 0 ) {
				throw new Exception("Custom Exception Test");
			}
			
			System.out.println("DB connection Open");
			
			arrNum[0] = 10;
			
			c = b / a; // 10/20 = 0.5
			//System.out.println("DB connection close");
		}catch(ArithmeticException e) {
			
			System.out.println(e.getMessage());
			
			a = 10;
			c = b / a;
		}catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e.getMessage());
			
			arrNum[0] = 10;
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("DB connection close");
		}
		
		System.out.println("C = " + c);
	}

}

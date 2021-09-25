package Static;

public class StaticTest {
	
	int a = 10;
	static int b = 25;
	
	public static void display() {
		System.out.println("static method" + b);
	}
	
	public void show() {
		System.out.println("static method" + b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		
		st1.a = 20;
		st2.a = 30;
		
		StaticTest.b = 30;
		
		System.out.println(st1.b);
		System.out.println(st2.b);
		*/
		
		StaticTest.display();
		
		
	}
	
	static {
		System.out.println("static block");
	}

}

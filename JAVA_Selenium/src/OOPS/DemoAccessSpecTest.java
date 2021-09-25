package OOPS;

 class DemoAccessSpecTest {

	private int i = 10;
	
	protected void display() {
		System.out.println("===" + i );
	}
	
	public void setValue(int a) {
		i =a;
	}
	
}

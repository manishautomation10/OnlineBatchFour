package OOPS;

public class University {
	
	String name;
	String region;
	int noCollage;
//	int noCource = 110000;
//	int Students = 45454445;
//	int faculties = 545444;
	
	
	public void conductExam() {
		
	}
	
	public void publishResult() {
		
	}		
	

	public static void main(String[] args) {
		//local variable
		int i = 10;
		int j = 0;
		
		
		// TODO Auto-generated method stub
		University nmu = new University();
		nmu.name = "NMU";
		nmu.noCollage = 200;
		nmu.region = "North";
		
		System.out.println(nmu.name);
		System.out.println(nmu.noCollage);
		System.out.println(nmu.region);
		
		System.out.println("********************************");
		
		University kop = new University();
		kop.name = "Kop";
		kop.noCollage = 300;
		kop.region = "West";
		
		System.out.println(kop.name);
		System.out.println(kop.noCollage);
		System.out.println(kop.region);
	}

}

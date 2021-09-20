
public class IfElseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int unit = 200;
		double billAmt = 0;
		
		if( unit <= 100 ) {
			billAmt = unit * 5;
		}else if(unit > 100 && unit <= 200) {
			billAmt = unit * 7;
		} else {
			billAmt = unit * 10;
		}
		System.out.println("Bill Amount :" + billAmt);
	}

}

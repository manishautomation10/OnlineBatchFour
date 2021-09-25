
public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 5;
		int col = 5;
		//i++ - i = i + 1;
		for(int i = 1; i <= row; i++) {
			
			for(int j = 1; j <= col; j++ ) {
				System.out.print(j + " ");
			}
			col--;
			System.out.println();
		}
		
		for(int i = 5; i >= 1; i--) {
			
			for(int j = i; j >=1; j-- ) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}
	
	

}

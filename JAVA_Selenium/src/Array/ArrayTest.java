package Array;

import java.util.Arrays;

public class ArrayTest {

	public void arrFun(int arrnumms[]) {
		
		for(int i = 0; i <5; i++) {
			System.out.println(arrnumms[i]);
		}
	}
	
	public int[] arrReturnFun() {
		
		int[] arrNum = new int[5];
		arrNum[3] = 10;
		arrNum[1] = 20;
		arrNum[2] = 50;
		arrNum[4] = 30;
		arrNum[0] = 20;
		
		return arrNum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int arrNum[];
		
		int[] arrNum = new int[5];
		boolean arrFlags[] = new boolean[10];
		
		arrNum[4] = 10;
		arrNum[1] = 20;
		arrNum[0] = 50;
		arrNum[3] = 30;
		arrNum[2] = 20;
		
		arrFlags[0] = true;
		arrFlags[1] = false;
		arrFlags[5] = false;
		
		
		ArrayTest obj = new ArrayTest();
		obj.arrFun(arrNum);
		
		int[] arr = obj.arrReturnFun();
		
		System.out.println(Arrays.toString(arrNum));
		
		for(int i = 0; i <5; i++) {
			System.out.println(arr[i]);
		}
	}

}

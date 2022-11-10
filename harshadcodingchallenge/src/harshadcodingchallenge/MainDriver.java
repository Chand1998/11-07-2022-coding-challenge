package harshadcodingchallenge;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {75,171,481,89,516,200};
		for(int i = 0; i < 6; i++) {
			System.out.println(isHarshad(arr[i]));
		}
		/*
		 * expected results of arr
		 * 75 -> false
		 * 171 -> true
		 * 481 -> true
		 * 89 -> false
		 * 516 -> true
		 * 200 -> true
		 */

	}
	
	public static boolean isHarshad(int n) {
		if(n % harshadRecursion(n) == 0)
			return true;
		
		return false;
	}
	
	public static int harshadRecursion(int n) {
		if(n == 0) 
			return 0;
		
		int lastDigit = n%10;
		n = n/10;
		return lastDigit + harshadRecursion(n);
		
	}
	

}

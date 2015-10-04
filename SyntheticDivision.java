import java.util.*;
public class SyntheticDivision {
	public static int[] DivisionArray(int[] p, int q) {
		int[] calc = new int[p.length]; 	// scratchpad for calculations
		int[] result = new int[p.length];	// result array
		
		result[0] = p[0];					// move the first index of the polynomial to the first index of result
		
		for(int i = 1; i <= p.length-1; i++) {
			calc[i] = result[i-1] * q;
			result[i] = p[i] + calc[i];
		}
		return result;
	}
	
	public static void printArr(int[] result) {
		for(int r : result) {
			System.out.print(r+" ");
		}
	}
	
	public static void main(String[] args) {
		// p is a polynomial: x^4 + 2x^3 + 3x^2 + 7x - 7
		// To-Do: user input for p and q
		int[] p = {1, 2, 3, 7, -7}; 		// coefficient of the polynomial
		int q = -1;							// c from quotient of (x-c)
		
		int[] result = DivisionArray(p, q);
		printArr(result);
	}
}

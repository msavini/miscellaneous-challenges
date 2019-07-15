import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * Matrix Multiply Class Implementation
 * 
 * @author savinm
 * @date 12/22/2018
 * Challenge found on CoderByte
 */

class matrixMult {
	
	public matrixMult() {
		
	}
	
	public static int[] array_construct(int size, String contents) {
		int[] out_array = new int[size];
		int k = 0;
		for(int j = 0; j < contents.length(); j++) {
			int num = 0;
			try {
				num = Integer.parseInt(contents.substring(j,j+1));
			} catch (NumberFormatException n){
				System.out.println("Array Construction Failed: number format exception");
			}	
			if (num != 0 && (k < size)) {
				out_array[k] = num;
				k += 1;
			} 
		}
		for (int i = 0; i < out_array.length;i++) {
			System.out.println(out_array[i]);
		}
		return out_array; 
	}
	
	public static void main (String[] args) {
		Scanner userInput = new Scanner(System.in);
		String T_in = userInput.nextLine();
		int T = Integer.parseInt(T_in);
		for (int i = 1; i < T; i++){
		    int array_size = Integer.parseInt(userInput.nextLine());
		    String array_contents = userInput.nextLine();
		    System.out.println(array_construct(array_size, array_contents).toString());
		}
		userInput.close();
	}
}
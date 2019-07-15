import java.util.Scanner;


/**
 * repeatingChars Class Implementation
 * @author savinm
 * @date 12/23/2018
 * Challenge found on CoderByte
 */


public class repeatingChars {
	private static char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','x','y','z',' '};
	private static int[] num = new int[27];
	public static String RepeatingChars(String in_string){
		//String output = new String(in_string);
		char[] array_string = in_string.toCharArray();
		int[] indices = new int[array_string.length];
		for (int i = 0; i < in_string.length(); i++) {
			for (int j = 0; j < alpha.length; j++) {
				if (array_string[i] == alpha[j]) {
					if (num[j] % 2 != 0) {
						indices[i] = 1;
					}
					num[j] += 1;
				}
			}
		}
		int newlen = in_string.length();
		String output = "";
		for (int i = 0; i < newlen; i++) {
			if(indices[i] != 1) {
				output += array_string[i];
			}
		}
		
		return output;
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    System.out.print(RepeatingChars(s.nextLine()));
	    s.close();
	}
}
import java.util.*;
import java.util.Set;


class Main {
	private static char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','x','y','z',' '};
	private static int[] num = new int[27];
	public static String RepeatingChars(String in_string){
		//String output = new String(in_string);
		int[] temp = num;
		char[] array_string = in_string.toCharArray();
		for (int i = 0; i < array_string.length; i++) {
			for (int j = 0; j < alpha.length; j++) {
				if (array_string[i] == alpha[j]) {
					if (num[j] % 2 != 0) {
						array_string[i] = 0;
					}
					num[j] += 1;
				}
			}
		}
		
		
		
		return in_string;
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    System.out.print(RepeatingChars(s.nextLine()));
	    s.close();
	}
}
import java.util.Scanner;

/**
 * Longest Word Class Implementation
 * 
 * @author savinm
 * @date 12/21/2018
 * Challenge found on CoderByte
 */


public class longestword{
	
	private String[] wordsArray;
	private String phrase;
	
	public longestword(String a) {
		this.phrase = a;
		this.wordsArray = a.split(" ");
	}
	
	public String findLongest() {
		for (int i = 0; i < this.wordsArray.length; i++) {
				this.wordsArray[i] = this.wordsArray[i].substring(0,1).toUpperCase() + this.wordsArray[i].substring(1);
		}
		String ret = "";
		for (int j = 0; j < this.wordsArray.length; j++) {
			if (j == this.wordsArray.length - 1) {
				ret += this.wordsArray[j];
			} else {
				ret += this.wordsArray[j] + " ";
			}
		}
		return ret;
	}
	
	public String getPhrase() {
		return new String(this.phrase);
	}
	

	public static void main(String args[]) {
		System.out.println("Test Phrase:");
		Scanner userInput = new Scanner(System.in);
		while(!userInput.hasNext());
		
		String input = "";
		if (userInput.hasNext()) input = userInput.nextLine();
        if (!input.equals("")) {
        	
        }
        userInput.close();
		longestword L = new longestword(input);
		String longest = L.findLongest();
		System.out.println("Longest Word = " + longest+"\n");
	}
	

}
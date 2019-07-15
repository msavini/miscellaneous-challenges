import java.util.*; 
import java.io.*;

public class pentagonalNumber {
    public static int total = 1;
    public static int i = 0;
    public static int[] sequence;
    public static int PentagonalNumber(int num) { 
        sequence = new int[num+1];
        sequence[0] = 0;
        for (i = 1; i <= num; i++){
            sequence[i] = 5*(i-1);
        }
        for (i = 0; i <= num; i++){
            total += sequence[i];
        }
        return total;
    } 
    public static void main (String[] args) {  
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        System.out.print(PentagonalNumber(s.nextLine())); 
    }   
  
}
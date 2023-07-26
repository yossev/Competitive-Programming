import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		int WakkoRoll = sc.nextInt();
		int YakkoRoll = sc.nextInt();
	    int max = java.lang.Math.max(WakkoRoll,YakkoRoll);
	    String[] arr = {"1/6", "1/3", "1/2", "2/3", "5/6", "1/1"};
	    
	    System.out.println(arr[6-max]);
		
		}
	}

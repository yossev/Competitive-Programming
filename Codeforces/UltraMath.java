import java.util.Scanner;
public class UltraMath {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String a = sc.nextLine();
    	String b = sc.nextLine();
    	char [] result = new char[a.length()];
    	for(int i = 0; i < a.length(); i++){
    		if(a.charAt(i) == b.charAt(i)){
    			result[i] = '0';
    		}
    		else{
    			result[i] = '1';
    		}
    	}
    	System.out.println(result);
    }
}

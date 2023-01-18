import java.util.Scanner;
public class Domino {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int length = sc.nextInt();
    	int width =  sc.nextInt();
    	int dominos = 2;
    	int result = 0;
    	if ((length * width) % 2 == 0){
    		 result = (length * width) / dominos;
    	}
    	else if ((length * width) % 2 != 0){
    		 result = ((length * width) - 1) / 2;
    		    }
    	System.out.println(result);
}
}
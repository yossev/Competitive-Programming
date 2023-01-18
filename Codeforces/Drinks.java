import java.util.Scanner;
public class Drinks {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	double result = 0;
    	for(int i = 0; i < n; i++){
    		result = result + sc.nextInt();
    	}
    	System.out.println(result/n);
    }
}
// Always try to find the quick ways to solve a problem.
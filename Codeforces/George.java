
import java.util.Scanner;
public class George {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for(int i = 0; i < n; i++){
			int j = sc.nextInt();
			int k = sc.nextInt();
			if((k-j)>=2){
				count++;
			}
		}
		System.out.println(count);
    }
}

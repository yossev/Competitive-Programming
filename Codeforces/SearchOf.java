
import java.util.Scanner;
public class SearchOf {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int count = 0;
    	int numOfP = sc.nextInt();
    	int[] ans = new int[numOfP];
    	for(int i = 0; i<numOfP;i++){
    		ans[i] = sc.nextInt();
    	}
    	for(int j = 0; j<ans.length; j++){
    		if(ans[j] == 1){
    			count++;
    		}
    	}
    	if (count > 0){
    		System.out.println("HARD");

    	}
    	else{
    		System.out.println("EASY");
    	}
    }
}

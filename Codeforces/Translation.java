import java.util.Scanner;
public class Translation {

    public static void main(String[] args) {
   	Scanner sc = new Scanner(System.in);
   	String s = sc.nextLine();
   	String t = sc.nextLine();
    String revS = "";
    for(int i = s.length()-1;i>=0;i--){
    	revS = revS + s.charAt(i);
    }
    if(revS.equals(t)){
    	System.out.println("YES");
    }
    else{
    	System.out.println("NO");
    }
}
}
import java.util.Scanner;


public class SoldierAndBananas {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int k = sc.nextInt();
      int dollars = sc.nextInt();
      int bananas = sc.nextInt();
      int cost = 0;
      for(int i = 1; i <= bananas; i++){
      	cost = cost + (i*k);

      }
      if(cost > dollars){
      	System.out.println(cost-dollars);
      }
      else
      	System.out.println(0);
   }
}
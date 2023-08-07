import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Number of test Cases
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int num = sc.nextInt();
            int[] arr = new int[num * 2];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }

            int oddCount = 0;
            int evenCount = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            if (evenCount == oddCount) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

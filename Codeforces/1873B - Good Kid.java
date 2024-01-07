import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tCases = sc.nextInt();

        for (int i = 0; i < tCases; i++) {
            int numDigits = sc.nextInt();
            int[] arr = new int[numDigits];

            for (int j = 0; j < numDigits; j++) {
                arr[j] = sc.nextInt();
            }
            
            Arrays.sort(arr); // Sort the array
            arr[0] += 1; // Increment the least by one
            int result = 1;

            for (int x = 0; x < arr.length; x++) {
                result *= arr[x];
            }

            System.out.println(result);
        }
    }
}


// Approach : Sort the Given Array of number and increment the least number by 1

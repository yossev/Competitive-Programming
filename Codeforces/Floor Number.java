import java.util.Scanner;
public class FloorNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // Petya's apartment number
            int x = scanner.nextInt(); // Apartments on each floor except the first one

            int floorNumber = findFloorNumber(n, x);
            System.out.println(floorNumber);
        }
    }

    public static int findFloorNumber(int n, int x) {
        if (n <= 2) {
            return 1; // Petya lives on the first floor
        }

        int apartmentsPerFloor = x; // Apartments per floor, excluding the first floor
        int floorsBelow = (n - 3 + apartmentsPerFloor) / apartmentsPerFloor;
        return floorsBelow + 1;
    }
}

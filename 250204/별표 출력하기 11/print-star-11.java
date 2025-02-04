import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n * 2 + 1; i++) {
            for (int j = 0; j < n * 2 + 1; j++) {
                if (i % 2 == 0) {
                    System.out.print("* ");
                } else {
                    if ( j == 0 || j == 2 || j == 4 || j == 6) {
                    System.out.print("*   ");
                    }

                }
            }
            System.out.println();
        }
    }
}
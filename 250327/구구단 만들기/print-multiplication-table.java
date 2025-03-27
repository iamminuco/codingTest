import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
            Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            for (int j = m; j >= n; j--) {
                if ( j % 2 == 0) {
                    System.out.print(j + " * " + i + " = " + j*i);

                    if (j > n) {
                        System.out.print(" / ");
                    }
                }
            }
            System.out.println();
        }
    }
}
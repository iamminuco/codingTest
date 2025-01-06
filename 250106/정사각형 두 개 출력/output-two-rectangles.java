import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        for (int i = 0; i < n*2; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i == n-1) {
                System.out.println();
            }
        }
    }
}
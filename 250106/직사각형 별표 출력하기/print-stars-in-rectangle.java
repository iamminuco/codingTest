import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int y = sc.nextInt();

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= y; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
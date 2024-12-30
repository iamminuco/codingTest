import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean isSide = false;

        for (int i = 1; i <= n; i++) {
            if ( n % i == 0) {
                if (i == 1 || i == n) {
                    isSide = true;
                }
            }
        }

        if(isSide) {
            System.out.println("P");
        } else {
            System.out.println("C");
        }

    }
}
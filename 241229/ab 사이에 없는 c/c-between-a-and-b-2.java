import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean isSide = false;

        for (int i = a; i <= b ; i++) {

            if (i % c == 0) {
                isSide = true;
            }
        }

        if (isSide) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            String s = sc.next();

            System.out.println(a*b);

            if (s.equals("C")) {
                break;
            }
        }
    }
}
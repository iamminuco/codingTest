import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int mid = sc.nextInt();
        int last = sc.nextInt();

        if (mid >= 90) {
            if (last >= 95) {
              System.out.println("100000");
            } else if (last >= 90) {
              System.out.println("50000");
            } else {
                System.out.println("0");
            }
        } else {
            System.out.println("0");
        }
    }
}
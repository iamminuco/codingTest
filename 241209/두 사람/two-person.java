import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a_age = sc.nextInt();
        String a_sex = sc.next();

        int b_age = sc.nextInt();
        String b_sex = sc.next();

        if ((a_age > 19 && a_sex.equals("M")) ||( b_age > 19 && b_sex.equals("M"))) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
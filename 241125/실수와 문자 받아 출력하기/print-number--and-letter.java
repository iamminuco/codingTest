import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println(str.charAt(0));
        System.out.printf("%.2f\n", a);
        System.out.printf("%.2f", b);
    }
}
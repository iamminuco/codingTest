import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // System.out.print(a / b + ".");

        // a %= b;

        // for (int i = 0; i < 20; i++ ) {
        //     a *= 10;
        //     System.out.print(a / b);
        //     a %= b;
        // }
        
        BigDecimal numerator = new BigDecimal(a);
        BigDecimal denominator = new BigDecimal(b);

        BigDecimal result = numerator.divide(denominator, 21, RoundingMode.DOWN);
        String format = result.setScale(20, RoundingMode.DOWN).toPlainString();
        System.out.println(format);

    }
}
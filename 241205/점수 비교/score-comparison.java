import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int aMath = sc.nextInt();
        int aEnglish = sc.nextInt();

        int bMath = sc.nextInt();
        int bEnglish = sc.nextInt();

        if (aMath > bMath || aEnglish > bEnglish ) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
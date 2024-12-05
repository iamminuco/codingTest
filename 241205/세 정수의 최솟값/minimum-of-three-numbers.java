import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] numsArr = {a, b, c};
        int min = numsArr[0];

        for (int i = 0; i < numsArr.length; i++) {
            if (numsArr[i] < min) {
                min = numsArr[i];
            }
        }

        System.out.println(min);

    }
}
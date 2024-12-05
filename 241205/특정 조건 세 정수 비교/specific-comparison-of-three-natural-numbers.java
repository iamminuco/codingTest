import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] minArr = {a, b, c};
        int min = minArr[0];

        for (int i = 0; i < minArr.length; i++)  {
            if (minArr[i] < min ) {
                min = minArr[i];
            }
        } 
        

        if (min == a) {
            System.out.print(1 + " ");
        } else {
            System.out.print(0 + " ");
        }

        if (a == b && b == c) {
            System.out.print(1 + " ");
        } else {
            System.out.print(0 + " ");
        }
        
    }
}
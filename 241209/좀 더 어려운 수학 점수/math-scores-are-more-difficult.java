import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a_math = sc.nextInt();
        int a_english = sc.nextInt();

        int b_math = sc.nextInt();
        int b_english = sc.nextInt();

        if (a_math == b_math && a_english > b_english || a_math > b_math) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
       
    }
}
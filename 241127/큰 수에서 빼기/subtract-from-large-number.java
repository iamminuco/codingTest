import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

        if(1 <= a || b <= 100) {
           System.out.println(Integer.max(a, b) - Integer.min(a, b)); 
        }


    }
}
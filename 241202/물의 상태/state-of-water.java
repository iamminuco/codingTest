import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int temper = sc.nextInt();

        if ( 0 > temper) {
            System.out.println("ice");
        } else if (100 <= temper) {
            System.out.println("vapor");
        } else if (0 == temper || 99 >= temper) {
            System.out.println("water");
        }
    }
}
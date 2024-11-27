import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt();
        int bmi = (10000*w) / (h*h) ;

        if (bmi >= 20) {
            System.out.print(bmi+"\n"+"Obesity");
        } else {
            System.out.print(bmi);
        }
    }
}
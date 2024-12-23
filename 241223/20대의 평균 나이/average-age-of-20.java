import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int count = 0;
        double avg = 0;
        int sum = 0;

        while (true) {
            int age = sc.nextInt();
            
            if ( age >= 20 && age <= 29) {
                sum += age;
                count++;
            } else {
                break;
            }
            
        }

        avg = (double)sum/count;

        System.out.printf("%.2f", avg);
    }
}
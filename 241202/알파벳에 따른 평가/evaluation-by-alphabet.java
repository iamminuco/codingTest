import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String d = sc.next();

        if (d.equals("S")) {
            System.out.println("Superior");
        } else if (d.equals("A")) {
            System.out.println("Excellent");
        } else if (d.equals("B")) {
            System.out.println("Good");
        } else if (d.equals("C")) {
            System.out.println("Usually");
        } else if (d.equals("D")){
            System.out.println("Effort");
        } else {
            System.out.println("Failure");
        }

    }
}
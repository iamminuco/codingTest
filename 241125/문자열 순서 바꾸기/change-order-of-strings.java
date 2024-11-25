import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String temp = "";

        temp = str1;
        str1 = str2;
        str2 = temp;

        System.out.print(str1+"\n"+str2);

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] strArr = str.split("\\.");
        System.out.println(strArr[1]+"-"+strArr[2]+"-"+strArr[0]);
        
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b= sc.nextInt(), c= sc.nextInt();
        int add = a+b+c;
        int ave = (a+b+c)/3;
        
        System.out.println(add);
        System.out.println(ave);
        System.out.println(add - ave);
    }
}
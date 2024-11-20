public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int a, b, c;
        int temp1;
        int temp2;

        a = 5;
        b = 6;
        c = 7;

        temp1 = b;
        temp2 = c;

        b = a;
        c = temp1;
        a = temp2;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
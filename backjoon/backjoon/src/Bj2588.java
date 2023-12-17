import java.util.Scanner;

public class Bj2588 {

    public void first() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        String b = sc.nextLine();

        System.out.println(a*(b.charAt(2) - '0'));
        System.out.println(a*(b.charAt(1) - '0'));
        System.out.println(a*(b.charAt(0) - '0'));

        System.out.println(a * Integer.parseInt(b));


        sc.close();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int b = sc.nextInt();

        int c = (b%100)%10;

        System.out.println(c);


        sc.close();
    }
}

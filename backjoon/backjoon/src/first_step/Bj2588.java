package first_step;

import java.util.Scanner;

public class Bj2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        int B = sc.nextInt();

        sc.close();

        System.out.println(A*((B % 100) %10));
        System.out.println(A*((B % 100) /10));
        System.out.println(A*((B/100)));

        System.out.println(A*B);
        
    }
}

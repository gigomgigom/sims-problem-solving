package second_step;

import java.util.Scanner;

public class Bj14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        sc.close();

        if(A>0){
            if(B>0)
            System.out.println("1");
            else if(B<0)
            System.out.println("4");
            else
            System.out.println("00");
        } else if(A<0){
            if(B>0)
            System.out.println("2");
            else if(B<0)
            System.out.println("3");
            else
            System.out.println("00");
        }
    }
}

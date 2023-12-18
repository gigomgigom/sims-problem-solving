package second_step;

import java.util.Scanner;

public class Bj2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();

        sc.close();

        if(minute < 45){
            if(hour == 0){
                 hour = 23;
                minute = 60+(minute-45);
                System.out.println(hour + " " + minute);
            }
            else {
                hour--;
                minute = 60+(minute-45);
                System.out.println(hour + " " + minute);
            }
        } else {
            minute = minute - 45;
            System.out.println(hour + " " + minute);
        }
    }
}

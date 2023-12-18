package second_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2480 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int price;


        if(A!=B&&B!=C&&A!=C){
            int max = 0;

            if(A>B){ //A max
                if(C>A){
                    max = C;
                } else{
                    max = A;
                }
            } else {
                if (B>C){
                    max = B;
                } else{
                    max = C;
                }
            }
            price = max * 100;
            System.out.println(price);
        } else {
            if(A==B&&A==C){
                price = 10000 + 1000 * A;
                System.out.println(price);
            } else {
                if(A==B||A==C){
                    price = 1000 + A * 100;
                    System.out.println(price);
                } else {
                    price = 1000 + B * 100;
                    System.out.println(price);
                }
            }
        }
    }
}

package third_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj8393 {
    public static void main(String[] args) throws IOException{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());

        int tot = 0;

        for(int i = 1; i <= A; i++) {
            tot+=i;
        }
        System.out.println(tot);
    }
}

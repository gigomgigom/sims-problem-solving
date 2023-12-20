package forth_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj3052 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] a = new boolean[42];

        int cnt = 0;

        for(int i = 0; i<10; i++) {
            int result = Integer.parseInt(br.readLine())%42;
            a[result] = true;
        }
        for(boolean o : a) {
            if(o) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

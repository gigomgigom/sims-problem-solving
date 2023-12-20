package forth_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj5597 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] tot = new int[30];

        for(int k = 0; k<tot.length; k++) {
            tot[k] = 0;
        }

        for(int i = 0; i<28; i++) {
            int a = Integer.parseInt(br.readLine());
            tot[a-1] = a;
        }

        for(int j = 0; j<tot.length; j++) {
            if(tot[j] == 0) {
                sb.append((j+1)+"\n");
            }
        }

        System.out.println(sb);
    }
    
}

package forth_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10818_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int max = -1000001;
        int min = 1000001;

        while(st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            
            if(num>max) {
                max = num;
            }
            if(num<min) {
                min = num;
            }
        }

        System.out.println(min + " " + max);
    }
}
package forth_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10807 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int[] num = new int[T];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i<T; i++) {
           num[i] = Integer.parseInt(st.nextToken());
        }

        int search = Integer.parseInt(br.readLine());

        int cnt = 0;

        for(int i = 0; i<T; i++) {
            if(num[i]==search){
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}

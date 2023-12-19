package forth_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10871 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());

        int X = Integer.parseInt(st.nextToken());

        int[] num = new int[N];

        st = new StringTokenizer(br.readLine(), " ");

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < N; i++){
            if(num[i]<X){
                sb.append(num[i]+" ");
            }
        }
        System.out.println(sb);
    }
}

package forth_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10811 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] basket = new int[N];

        for(int i = 0; i<basket.length; i++) { //배스킷 배열안에 값 저장
            basket[i] = i+1;
        }

        for(int j = 0; j<M; j++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken())-1;
            int b = Integer.parseInt(st.nextToken())-1;

            while(a<b) {
                int tmp = basket[a];
                basket[a++] = basket[b];
                basket[b--] = tmp;
            }
        }
        br.close();

        for(int o : basket) {
            System.out.print(o + " ");
        }
    }
}

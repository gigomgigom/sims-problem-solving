package third_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj25304 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tot = Integer.parseInt(br.readLine());
        int cnt = Integer.parseInt(br.readLine());

        int totprice = 0;

        for(int i = 0; i<cnt; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int price = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());

            totprice += (price*count);
        }

        if(tot == totprice) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

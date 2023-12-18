package second_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2525 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int C = Integer.parseInt(br.readLine());

        int cook = A*60 + B;
        
        cook += C;

        int hour = (cook/60)%24;

        int min = cook%60;

        System.out.println(hour+" "+min);
    }
}

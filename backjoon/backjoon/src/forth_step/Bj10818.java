package forth_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj10818 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] num = new int[T];

        int i = 0;

        while(st.hasMoreTokens()) {
            num[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        Arrays.sort(num);

        System.out.println(num[0]+" "+num[T-1]);
    }
}

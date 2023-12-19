package forth_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2562 {
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
       int[] num = new int[9];
       int index = 0;
       int max = num[0];

       for(int i = 0; i<num.length; i++){
        num[i] = Integer.parseInt(br.readLine());
        if(max<num[i]){
            max = num[i];
            index = i+1;
        }
       }

       System.out.println(max+"\n"+index);
    }
}
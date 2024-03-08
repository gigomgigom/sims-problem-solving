package kosa;

import java.util.Scanner;

public class Bj10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testCnt = Integer.parseInt(sc.nextLine());
        int height;
        int width;
        int customerCnt;

        String roomNum;

        String[] roomNumArr = new String[testCnt];
        
        for(int i = 0; i < testCnt; i++) {

            String input = sc.nextLine();
            String[] inputInfo = input.split(" ");
            height = Integer.parseInt(inputInfo[0]);
            width = Integer.parseInt(inputInfo[1]);
            customerCnt = Integer.parseInt(inputInfo[2]);

            int floor = customerCnt % height;
            if(floor == 0) {
                floor = height;
            }
            int roomlocation = customerCnt / height;
            roomlocation++;
            if(roomlocation < 10) {
                roomNum = String.valueOf(floor) + "0" + String.valueOf(roomlocation);
            } else {
                roomNum = String.valueOf(floor) + String.valueOf(roomlocation);
            }
            roomNumArr[i] = roomNum;
        }
        for(int i = 0; i < roomNumArr.length; i++) {
            System.out.println(roomNumArr[i]);
        }
    }
}
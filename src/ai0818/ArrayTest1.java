package ai0818;

import java.util.Scanner;

public class ArrayTest1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // 콘솔로부터 입력받을 수 있는 객체

        int[] numArr = new int[5];
        int sum = 0;

        for(int i = 0 ; i < numArr.length ; i++){
            System.out.printf("* (%d) 정수입력:\n", i+1);
            numArr[i] = s.nextInt();
            sum += numArr[i];
        }

        for(int i = 0 ; i < numArr.length ; i++){
            if(i < 4){
                System.out.print(numArr[i] + " + ");
            }else{
                System.out.print(numArr[i] + " = ");
            }


        }
        System.out.print(sum);
        s.close();
    }
}


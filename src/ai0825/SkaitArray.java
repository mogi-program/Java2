package ai0825;

import java.util.Arrays;
import java.util.Scanner;

public class SkaitArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Integer[] scores = new Integer[5];
        for(int i = 0 ; i < scores.length ; i++){
            System.out.print("점수를 입력해주세요: ");
            scores[i] = s.nextInt();
        }
        int sum = 0;
        int avg;
        for(int i : scores){
            sum += i;
        }
        avg = sum/scores.length;
        System.out.println("심사위원 입력점수 : "+ Arrays.toString(scores));
        System.out.println("합계: "+ sum + "\n평균: "+ avg);
    }
}

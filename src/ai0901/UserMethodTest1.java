package ai0901;

import java.util.Random;

public class UserMethodTest1 {
    public static void testDice(String userName){
        System.out.println(userName + "님, 주사위를 던지세요.");
        Random rand = new Random();
        int diceNum = rand.nextInt(6) + 1;
        System.out.println("주사위 번호: "+diceNum);
    }


    public static void main(String[] args) {
        testDice("사과");
        testDice("키위");
        testDice("복숭아");

        String[] users = {"사과", "키위", "복숭아", "딸기", "무화과"};
        for(String user : users ){
            testDice(user);
        }
    }
}

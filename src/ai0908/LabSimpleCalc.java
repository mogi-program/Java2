package ai0908;

import java.util.Scanner;

public class LabSimpleCalc {

    public static int calc(int n1, int n2, String op){
        int result = 0;
        switch (op){
            case "+": result = n1 + n2;
                break;
            case "-": result = n1 - n2;
                break;
            case "*": result = n1 * n2;
                break;
            case "/": result = n1 / n2;
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        while(true){
            System.out.println("새로운 연산을 시작합니다.");
            System.out.print("첫번째 숫자를 입력하세요: ");
            int n1 = s1.nextInt();
            System.out.print("두번째 숫자를 입력하세요: ");
            int n2 = s1.nextInt();
            System.out.println("적용시킬 연산자를 입력하세요(+, -, *, /) - 연산 종료를 원하시면 \"end\"를 입력하세요");
            String op = s2.nextLine();
            if(op.toLowerCase().equals("end")){
                System.out.println("연산을 종료합니다");
                break;
            }
            System.out.println("계산 결과 :" +  calc(n1, n2, op));
        }


        s1.close();
        s2.close();



    }
}

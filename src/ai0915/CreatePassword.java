package ai0915;

import java.util.Scanner;

public class CreatePassword {

    static boolean passwordCheck(String pwd){
        boolean check = true;
        if(pwd.length()<8){
            check = false;
        }
        for(int i=0;i<pwd.length();i++){
            char ch = pwd.charAt(i);
            if(!Character.isAlphabetic(ch)){
                return false;
            }
        }

        return check;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("새로운 비밀번호를 입력하세요 -8글자 이상, 영어 소문자만 입력 가능-: ");
        String password = sc.nextLine();
        if(passwordCheck(password)){
            System.out.println("비밀번호 생성을 완료했습니다");
        }
        else{
            System.out.println("비밀번호 생성 조건과 달라 실패했습니다.");
        }
    }
}

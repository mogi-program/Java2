package ai0922;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LAB_PasswordTest {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("password.txt")){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Password:");
            String inStr = sc.nextLine();

            for(int i = 0; i<inStr.length(); i++){
                String secure = "";
                int num = (int)inStr.charAt(i);
                num += 100;
                secure += (char)num;
                fw.write(secure);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

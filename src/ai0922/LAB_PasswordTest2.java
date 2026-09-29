package ai0922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LAB_PasswordTest2 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("password.txt"))) {

            StringBuilder decrypted = new StringBuilder();
            int ch;

            while ((ch = br.read()) != -1) {
                int num = ch - 100;
                decrypted.append((char) num);
            }

            System.out.println("Decrypted Password: " + decrypted.toString());

        } catch (IOException e) {
            System.err.println("파일을 읽는 중 오류가 발생했습니다: " + e.getMessage());
        }
    }
}
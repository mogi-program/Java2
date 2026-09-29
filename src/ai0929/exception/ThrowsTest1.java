package ai0929.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsTest1 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("myData.txt"))) {
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

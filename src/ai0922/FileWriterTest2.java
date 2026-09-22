package ai0922;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterTest2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("새로 만들 텍스트 파일명을 입력하세요: ");
            String fileName = sc.nextLine();
            String line = "";
            if(!fileName.contains(".txt")){
                fileName = fileName + ".txt";
            }
            FileWriter fw = new FileWriter(fileName, true);

            while(true){
                System.out.println("입력하실 문자열을 입력하세요(종료를 원할 경우 \"exit\" 입력): ");
                line = sc.nextLine();
                if(line.equals("exit")){
                    break;
                }
                fw.write(line + "\n");
            }
            fw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

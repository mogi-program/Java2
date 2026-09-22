package ai0922;

import java.io.FileWriter;
import java.io.IOException;

public class FlilWriterTest1 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("myData2.txt");
            String line = "";

            line = "오늘은 추석 연휴가 시작되는 전전날입니다.";
            fw.write(line + "\n");

            line = "내일 너무나 신나는 추석연휴가 시작되는 전날입니다.";
            fw.write(line + "\n");

            line = "야호 내일 모레는 추석연휴가 시작되는 날입니다.";
            fw.write(line + "\n");

            fw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

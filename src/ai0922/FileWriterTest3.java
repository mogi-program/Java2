package ai0922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

public class FileWriterTest3 {
    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter("myData3.txt");
             BufferedReader br = new BufferedReader(new FileReader("myData2.txt"));) {

            String line;
            while ((line = br.readLine()) != null) {
                fw.write(line + "\r\n");
            }

        } catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}

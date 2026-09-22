package ai0922;

import java.io.*;

public class LAB_AddLineNumber {
    public static void main(String[] args) {
        try{
//            BufferedReader br = new BufferedReader(new FileReader("D:/FileIOTest/myData1.txt"));
            BufferedReader br = new BufferedReader(new FileReader("myData1.txt"));
            int num1 = 1;
            String line = "";

            while(true){
                line = br.readLine();
                if(line==null){
                    break;
                }
                System.out.println(num1 + " : " + line);
                num1++;
            }

        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}

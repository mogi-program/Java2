package ai0922;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageFileCopy {
    public static void main(String[] args) {
        try(FileInputStream fIn =  new FileInputStream("fire.jpg");
            FileOutputStream fOut = new FileOutputStream("fireCopy.jpg");) {

            byte data;
            while ((data = (byte)fIn.read()) != -1) {
                fOut.write(data);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

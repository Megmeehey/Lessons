package lesson170731;

import java.io.FileInputStream;
import java.io.IOException;

public class TryCatchFinallyExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("start");

        try (FileInputStream fis = new FileInputStream("/tmp/help.txt")) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int read = fis.read();
            System.out.println(read);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }


        System.out.println("finish");
    }
}

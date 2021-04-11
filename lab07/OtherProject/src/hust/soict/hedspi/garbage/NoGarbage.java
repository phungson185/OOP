package hust.soict.hedspi.garbage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NoGarbage {
    public static void main(String[] args) {
        StringBuilder myStr = new StringBuilder();
        try {
            File myText = new File("/home/phungson/20202/_OOP/lab05/OtherProject/src/hust/soict/hedspi/test");
            Scanner myScanner = new Scanner(myText);
            while(myScanner.hasNextLine()) 
                myStr.append(myScanner.nextLine());
            System.out.println(myStr);
            myScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found or can't read");
            e.printStackTrace();
        }
    }
}
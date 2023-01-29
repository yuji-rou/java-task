import java.io.*;

public class TryCatchFinallySample {
    public static void main (String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("date.txt");
            fw.write("try");
            System.out.println("try");
        } catch (IOException e) {
            System.out.println("catch");
        } finally {
            if (fw != null) {
                try {
                    System.out.println("finally");             
                    fw.close();
                } catch (IOException e) {
                  ;  
                }    
            }
        }
    }    
}
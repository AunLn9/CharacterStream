package characterstream3;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

// PrintWriter
// อ่าน-เขียนข้อมูลทีละบรรทัด
public class LAB3 {
    public static void main(String[] args) {
        try {
            PrintWriter output = new PrintWriter("lab3.txt");
            output.println("Harry Potter");
            output.println(19);
            output.println(60.5);
            output.println(175.0);
            output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileReader file = new FileReader("lab3.txt");
            BufferedReader input = new BufferedReader(file);
            String s;
            while ((s = input.readLine()) != null ) {
                System.out.println(s);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

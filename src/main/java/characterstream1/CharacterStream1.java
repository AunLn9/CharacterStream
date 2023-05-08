package characterstream1;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

// การใช้งานของ BufferedWriter and BufferedReader
// อ่าน-เขียนข้อมูลทั้งไฟล์เอามาเก็บไว้ลงใน Buffer (หน่วนความจำชั่วคราวสร้างขึ้นใน memory)
// BufferedReader : อ่านทีละบรรทัด
// BufferedWriter : แต่เขียนทีละบรรทัดไม่ได้
public class CharacterStream1 {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("data.txt");
            BufferedWriter output = new BufferedWriter(file);
            output.write("Hello World");
            output.write("Welcome to JAVA");
            output.close();
        } catch (IOException ex) {
            Logger.getLogger(CharacterStream1.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileReader file = new FileReader("data.txt");
            BufferedReader input = new BufferedReader(file);
            String s;
            while ((s = input.readLine()) != null ) {
                System.out.println(s);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CharacterStream1.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(CharacterStream1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

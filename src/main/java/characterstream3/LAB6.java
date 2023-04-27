package characterstream3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


// InputStreamReader : ใช้ในการอ่านข้อมูลจาก keyboard (เป็นการพิมพ์รับข้อมูลจาก keyboard)
// Class Scanner : ใช้ในการอ่านข้อมูลหรือรับข้อมูลจาก keyboard ได้โดยตรง (เพื่อรับข้อมูล Primetive type)
public class LAB6 {
    public static void main(String[] args) {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(in);
        try {
            System.out.print("Enter name: ");
            String name = input.readLine();
            System.out.println(name);

            System.out.print("Enter age: ");
            String age = input.readLine(); // ใช้ int จะเกิด error
            System.out.println(age);

        } catch (IOException ex) {
            Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

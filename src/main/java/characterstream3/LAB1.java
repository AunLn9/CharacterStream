package characterstream3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

// การใช้งานของ FileWriter and FileReader
// อ่านทีละ character หรือหลาย character จะอยู่ต่อในบรรทัดเดียวกันเลย
// เขียน-อ่านข้อมูลลงใน text file
public class LAB1 {
    public static void main(String[] args) {
        try {
            FileWriter output = new FileWriter("data.txt");
            output.write("Hello World");
            output.write("Welcome to JAVA");
            // ก่อนเขียน output.close(); | เขียนลง stream แล้ว stream อยู่ที่ ram ทำให้ไม่เห็นข้อมูลที่เขียนในไฟล์ data.txt
            output.close();
            // หลังเขียน output.close(); | ใส่เพื่อที่จะได้เอาข้อมูลลงฮาร์ดดิสเพื่อที่จะเอาข้อมูลเขียนลงไฟล์ให้เราทำโดยการ close หรือ flush
        } catch (IOException ex) {
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileReader input = new FileReader("data.txt");
            // input.read() = อ่านทีละ 1 character
            // อ่านหลาย character ใช้ loop
            int ch;
            while ((ch = input.read()) != -1) {
                System.out.println((char) ch);
                // System.out.print((char) ch); ลบ ln ออกจะปริ้นติดกันบรรทัดเดียว
                // ถ้าไม่ใส่ char จะรันออกมาเป็นตัวเลข (int) | 1 character = 2 bytes
                // เมื่อใส่ char ไปแล้วจะรันออกมาเป็นตัวอักษร
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
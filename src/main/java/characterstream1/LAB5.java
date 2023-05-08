package characterstream1;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB5 {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("lab3.txt");
            BufferedReader input = new BufferedReader(file);
                // BufferedReader จะ return ข้อมูลเป็น String ไม่สามารถอ่านพวก int ได้เลยใช้ Scanner เข้ามาช่วยตาม LAB4
            String name = input.readLine();
            System.out.println(name);
            //int age = (int) input.readLine();
            //System.out.println(age);
            //double weight = input.readLine();
            //System.out.println(weight);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

// Summary CharacterStream
// ข้อมูลลงไฟล์ที่เป็น primetive type ใช้ "PrintWriter" ในการเขียน | ใช้ "Class Scanner" ในการอ่าน
// แต่ถ้าเป็น String อย่างเดียวใช้ CharacterStream ค่อนข้างสะดวกเพื่อเก็บข้อมูลที่มันเป็น text file
// BufferedWriter เหมาะกับการทำงานพวก text file
// FileWriter|FileReader ใช้สำหรับเขียน-อ่านข้อมูลลงไฟล์ ทีละ character หรือหลายๆ character
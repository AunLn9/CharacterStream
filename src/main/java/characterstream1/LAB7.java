package characterstream1;

import java.util.Scanner;

// Class Scanner : ใช้ในการอ่านข้อมูลหรือรับข้อมูลจาก keyboard ได้โดยตรง (เพื่อรับข้อมูล Primetive type)
// System.in คือ keyboard
public class LAB7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = input.nextLine(); // nextLine() จะ return String (พวก text)
        System.out.println(name);

        System.out.print("Enter age: ");
        int age = input.nextInt();
        System.out.println(age);

        System.out.print("Enter height: ");
        double height = input.nextDouble();
        System.out.println(height);
    }
}

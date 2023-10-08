package org.example;
import java.util.Scanner;
class TeacherView<T extends Teacher>{
    Scanner scan = new Scanner (System.in);
   TeacherController contra = new TeacherController();
    public void menu(){
        boolean check = true;
        int n;
        while(check){
            System.out.println("\n1 - создать запись\n2 - список\n3 - редактировать запись\n4 - удалить запись\n0 - выход");
            n = scan.nextInt();
            switch(n) {
                case (1):
                    contra.createTeacher();
                    System.out.println("_".repeat(50));
                    break;
                case (2):
                    printTeachers();
                    System.out.println("_".repeat(50));
                    break;
                case (3):
                    System.out.println("\nВведите номер учителя: ");
                    int index = scan.nextInt()-1;
                    System.out.println(contra.teacherGroup.get(index));
                    System.out.println("Введите команду:\n1 - изменить имя\n2 - изменить возраст\n3 - изменит номер\n0 - отмена");
                    int m = scan.nextInt();
                    if (m == 1) {contra.editorName(index);}
                    else if (m == 2) {contra.editorAge(index);}
                    else if (m == 3) {contra.editorPhone(index);}
                    else if (m == 0) {break;}
                    System.out.println("_".repeat(50));
                    break;
                case (4):
                    System.out.println("Введите номер учителя: ");
                    index = scan.nextInt()-1;
                    System.out.println(contra.teacherGroup.get(index) + " - Удалено.");
                    contra.teacherGroup.removeTeacher(contra.teacherGroup.get(index));
                    System.out.println("_".repeat(50));
                    break;
                case (0):
                    check = false;
                    break;
            }
        }
    }

    public void printTeachers(){
        System.out.println(contra.teacherGroup.getGroup());
    }
}

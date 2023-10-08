package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TeacherController{
    Scanner scan = new Scanner(System.in);
    TeacherGroup teacherGroup = new TeacherGroup<>();
    public int inputNumber(String text){
        System.out.print(text);
        int n = scan.nextInt();
        return n;
    }
    public String inputString(String text){
        Scanner scanner = new Scanner(System.in);
        System.out.print(text);
        String txt = scanner.nextLine();
        return txt;
    }
    public void createTeacher() {
        Teacher teacher = new Teacher(inputString("Введите имя: "), inputNumber("Введите возраст: "), inputNumber("Введите номер телефона: "));
        if (TeacherServis.ageCheck(teacher.getAge())) {
            if (TeacherServis.phoneCheck(teacher.getPhone())){
                Teacher.setCount(Teacher.getCount()+1);
                teacher.setIndex(Teacher.getCount());
                teacherGroup.addTeacher(teacher);
                System.out.println(teacher + " - Добавлено.");
            }
            else System.out.println("Некоректный номер");
        }
        else System.out.println("Некоректный возраст");
    }
    public void editorName(int index){
        teacherGroup.get(index).setName(inputString("Введите новое имя: "));
        System.out.println("\nСохранено.");
    }
    public void editorAge(int index){
        int n = inputNumber("Введите новое значение: ");
        if(TeacherServis.ageCheck(n)){
            teacherGroup.get(index).setAge(n);
            System.out.println("Сохранено.");
        }
        else System.out.println("\nОшибка - некоректный возраст");
    }
    public void editorPhone(int index){
        int phone = inputNumber("Введите другой номер: ");
        if(TeacherServis.phoneCheck(phone)){
            teacherGroup.get(index).setPhone(phone);
            System.out.println("Сохранено.");
        }
        else System.out.println("\nОшибка - некоректный номер");
    }

}

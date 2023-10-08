package org.example;

public class TeacherServis {
    public static boolean ageCheck(int age){
        if (age>18 && age<99) return true;
        else return false;
    }
    public static boolean phoneCheck(int phone){
        if(Integer.toString(phone).length() == 3) return true;
        else return false;
    }
}

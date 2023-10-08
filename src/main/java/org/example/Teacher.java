package org.example;

public class Teacher {
    private String name;
    private int age;
    private int phone;
    private int index;
    private static int count;
    public Teacher (String name, int age, int phone){
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getPhone(){

        return phone;

    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setPhone(int phone){
        this.phone = phone;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public static void setCount(int count) {
        Teacher.count = count;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString(){
        return "\nНомер: " + index + " | " +
                "Имя: " + name + " | "+
                "Возраст: " + age + " | " +
                "Телефон: " + phone;
    }
}

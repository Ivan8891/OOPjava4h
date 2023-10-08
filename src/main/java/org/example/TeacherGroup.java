package org.example;
import java.util.ArrayList;
import java.util.List;

public class TeacherGroup <T extends Teacher>{
    private String nameGroup;
    private List<T> group = new ArrayList<>();
    private T teacher;

    public void addTeacher(T teacher){
        group.add(teacher);
    }
    public void removeTeacher(T teacher){
        group.remove(teacher);
    }
    public T get(int index){
        return group.get(index);
    }

    public List<T> getGroup() {
        return group;
    }
}

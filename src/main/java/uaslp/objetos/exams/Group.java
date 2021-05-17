package uaslp.objetos.exams;


import java.util.*;

public class Group {
    private LinkedList<Student> students;
    private int capacity;
    private double average;

    public Group(int capacity) {
        this.capacity = capacity;
        students = new LinkedList<Student>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public boolean getAvailability() {
        if(capacity >= students.size())
            return false;
        else
            return true;
    }

    public double getAverage() {
        double aux = 0;
        for(int i = 0;i < students.size(); i++){
            aux += students.get(i).getAverage();
        }

        return aux / students.size();
    }

    public LinkedList<Student> getStudents(){
        return students;
    }
}

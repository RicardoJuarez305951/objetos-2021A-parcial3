package uaslp.objetos.exams;


import java.util.*;

public class Group {
    private LinkedList<Student> students;
    private int capacity;
    private int availability;
    private double average;

    public Group(int capacity) {
        this.capacity = capacity;
        this.availability = capacity;
        students = new LinkedList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getAvailability() {
        return availability;
    }

    public void addStudent(Student student) {
        if(availability <= 0){
            throw new GroupIsFullException();
        }
        students.add(student);
        availability--;
    }

        public double getAverage() {
        double aux = 0;
            for (Student student : students) {
                aux += student.getAverage();
            }

        return aux / students.size();
    }

    public LinkedList<Student> getStudents(){
        return students;
    }
}

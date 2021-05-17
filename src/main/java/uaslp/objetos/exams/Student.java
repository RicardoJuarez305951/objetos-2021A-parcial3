package uaslp.objetos.exams;

public class Student {
    private String name;
    private int code;
    private int p1,p2,p3,p4;


    public Student(String name, int code){
        this.name=name;
        this.code=code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public void setScore(int i, int i1) {
        if(i==1)
            p1 = i1;
        if(i==2)
            p2 = i1;
        if(i==3)
            p3 = i1;
        if(i==4)
            p4 = i1;

    }

    public double getAverage() {
        return (double) (p1+p2+p3+p4) / 4F;
    }
}

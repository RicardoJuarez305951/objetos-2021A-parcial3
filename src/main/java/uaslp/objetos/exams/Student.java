package uaslp.objetos.exams;

public class Student {
    private Integer[] score;
    private String name;
    private int code;



    public Student(String name, int code){
        this.name=name;
        this.code=code;
        score = new Integer[3];
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public void setScore(int i, int i1) {
        if(i < 1 || i > 3){
            throw new InvalidPartialException();
        }
            score[i-1] = i1;

    }

    public double getAverage() {
        double average=0;

        for (int i = 0; i < 3; i++){
            if(score[i] == null){
                throw new MissingScoreException("Missing partial " + (i+1));
            }
            average += score[i];
        }
        average = average / 3F;
        return average;
    }
}

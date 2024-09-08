package Prototype;

public class Student implements Prototype.Interface.Prototype<Student> {
    private String name;
    private int age;
    private String College;
    private int perc;
    private int avgBacthPerc;

    private String batch;

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public Student(){}

    public Student(Student student){
        this.College = student.getCollege();
        this.avgBacthPerc = student.getAvgBacthPerc();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCollege() {
        return College;
    }

    public void setCollege(String college) {
        College = college;
    }

    public int getPerc() {
        return perc;
    }

    public void setPerc(int perc) {
        this.perc = perc;
    }

    public int getAvgBacthPerc() {
        return avgBacthPerc;
    }

    public void setAvgBacthPerc(int avgBacthPerc) {
        this.avgBacthPerc = avgBacthPerc;
    }



    @Override
    public Student clone() {

        // here this representing current object
        // after new objetc creation it passing to create same object
        return new Student(this);
    }
}

package Prototype;

public class IntelligentStudent extends Student {
    private int IQ;

    public IntelligentStudent(){}

    public IntelligentStudent(Student student){
        super(student);
        this.IQ = 50;
    }

    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }
}

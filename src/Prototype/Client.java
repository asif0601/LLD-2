package Prototype;

public class Client {

    public static void main(String[] args) {

        // Register
        Registery register = new Registery();


        // client don't know what attribute you have
        // there can be possible 50 attr
        // in this situation it will not work
        /*
        Student student = new Student();
        student.setCollege("Manit");
        student.setAvgBacthPerc(40);

        Student stdCopy = new Student();
        stdCopy.setCollege(student.getCollege());
        stdCopy.setAvgBacthPerc(student.getAvgBacthPerc());
         */

        // clone method
        /*
        Student student = new Student();
        student.setCollege("Manit");
        student.setAvgBacthPerc(40);
        Student stCopy = student.clone();
        */

        // Intelligent Student
        IntelligentStudent is = new IntelligentStudent();
        is.setCollege("manit");
        is.setAvgBacthPerc(50);
        is.setBatch("2017");
        register.register("2017", is);



        IntelligentStudent isCopy = is.clone();
        IntelligentStudent regCopy = (IntelligentStudent) register.getCopy("2017").clone();


        System.out.println("last line");



    }
}

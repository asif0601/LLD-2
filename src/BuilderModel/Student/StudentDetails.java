package BuilderModel.Student;

import BuilderModel.Builder;
import BuilderModel.Helper.Helper;

public class StudentDetails {
    private String firstName;
    private int age;



    private StudentDetails(Builder builder){
        if (builder.age > 10) {
            throw new IllegalArgumentException("age should be greater than "+builder.age);
        }
        this.firstName = builder.firstName;
        this.age = builder.age;
    }
    public static class Builder{
        private  String firstName;
        private int age;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentDetails build(){
             return new StudentDetails(this);
        }
    }

}

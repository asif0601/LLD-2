package BuilderModel.Helper;

public class Helper {
    private String firstName;
    private int age;
    private String lastName;

    public Helper(String firstName,int age,String lastName){
        this.firstName = firstName;
        this.age = age;
        this.lastName = lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setLastName(String name) {
        this.lastName = name;
    }
    public String getFirstName() {
        return firstName;
    }
    public int getAge() {
        return age;
    }
    public String getLastName() {
        return lastName;
    }

}

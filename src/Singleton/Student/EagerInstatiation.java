package Singleton.Student;

public class EagerInstatiation {
    public static EagerInstatiation eagerInstatiation = new EagerInstatiation();

    private EagerInstatiation(){
        // private constructor
        // to prevent instantiated
    }

    public static EagerInstatiation getInstance(){
        return eagerInstatiation;
    }
}

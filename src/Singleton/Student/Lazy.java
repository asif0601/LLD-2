package Singleton.Student;

public class Lazy{
    public static Lazy database = null;


    private Lazy(){
        // private constructor
        // to prevent instantiated
    }

    public static Lazy getInstance(){
        if(database == null){
            synchronized (Lazy.class){
                if(database == null){
                    database = new Lazy();
                }
            }
            database = new Lazy();
        }
        return database;
    }


}

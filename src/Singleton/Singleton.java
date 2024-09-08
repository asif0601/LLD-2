package Singleton;

import Singleton.Student.EagerInstatiation;
import Singleton.Student.Lazy;

public class Singleton {
    public static void main(String[] args) {
        System.out.println("Singleton design pattern");
        // Lazy instatiation of object
        Lazy database = Lazy.getInstance();

        // Eager instatiation of object
        EagerInstatiation eagerInstatiation = EagerInstatiation.getInstance();

    }
}

package Prototype;

import Prototype.Interface.Prototype;

import java.util.HashMap;

public class Registery {

    HashMap<String, Prototype> map = new HashMap<>();

    public void register(String key, Prototype prototype){
        map.put(key, prototype);
    }

    public Prototype getCopy(String key){
        if (map.containsKey(key)){
            return map.get(key);
        }
        return null;
    }
}

package models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class DB {
    private Map<Character, List<Person>> contacts;

    public DB() {
        contacts = new HashMap<>();
    }


    public List<Person> searchPerson(Person person){
        return null;
    }
    public boolean addPerson(Person person) {
        return true;
    }

    public boolean changePerson(Person person) {
        return true;
    }

    public boolean removePerson(Person person) {
        return true;
    }
}

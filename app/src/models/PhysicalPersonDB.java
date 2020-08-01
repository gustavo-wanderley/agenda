package models;

import java.util.HashMap;
import java.util.List;

public class PhysicalPersonDB extends DB {

    public PhysicalPersonDB(){
        contacts = new HashMap<Character, List<Person>>();
    }

    @Override
    public Person searchPerson(Person person) {
        return null;
    }

    @Override
    public boolean addPerson(Person person) {
        return false;
    }

    @Override
    public boolean changePerson(Person person) {
        return false;
    }

    @Override
    public boolean removePerson(Person person) {
        return false;
    }
}

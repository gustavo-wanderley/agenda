package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LegalPersonDB extends DB{

    public LegalPersonDB(){
        contacts = new HashMap<Character, List<Person>>();
    }

    @Override
    public Person searchPerson(Person person) {

        return null;
    }

    @Override
    public boolean addPerson(Person person) {
        char letter = person.getName().toLowerCase().charAt(0);
        if(contacts.containsKey(letter)){
            var persons = contacts.get(letter);
            persons.add(person);
        }
        var persons = new ArrayList<Person>();
        contacts.put(letter, persons);
        return true;
    }

    @Override
    public boolean changePerson(Person person) {
        return false;
    }

    @Override
    public boolean removePerson(Person person) {
        char letter = person.getName().toLowerCase().charAt(0);
        if(contacts.containsKey(letter)){
            var persons = contacts.get(letter);
            persons.remove(person);
            return true;
        }
        return false;
    }
}

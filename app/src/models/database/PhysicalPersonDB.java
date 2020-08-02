package models.database;

import models.Person;
import models.database.DB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhysicalPersonDB extends DB {

    public PhysicalPersonDB() {
        contacts = new HashMap<>();
    }

    @Override
    public Person searchPerson(Person person) {

       // for(Entry<Integer, List<Person>> entry : contacts.entrySet())
    }

    @Override
    public boolean addPerson(Person person) {

        char letter = person.getName().toLowerCase().charAt(0);
        if (contacts.containsKey(letter)) {
            var persons = (List<Person>) contacts.get(letter);
            persons.add(person);
        }
        var persons = new ArrayList<Person>();
        contacts.put(letter, persons);
        return true;
    }

    @Override
    public boolean changePerson(Person person) {

        char letter = person.getName().toLowerCase().charAt(0);
        var persons = contacts.get(letter);
        removePerson(person);
        return persons.add(person);
    }

    @Override
    public boolean removePerson(Person person) {
        char letter = person.getName().toLowerCase().charAt(0);
        if (contacts.containsKey(letter)) {
            var persons = contacts.get(letter);
            persons.remove(person);
            return true;
        }
        return false;
    }
}

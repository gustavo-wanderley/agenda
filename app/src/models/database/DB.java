package models.database;

import models.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class DB {
    protected Map<Character, List<Person>> contacts;


    public abstract Person searchPerson(Person person);

    public abstract boolean addPerson(Person person);

    public abstract boolean changePerson(Person person);

    public abstract boolean removePerson(Person person);

}

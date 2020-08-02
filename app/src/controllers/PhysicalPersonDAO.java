package controllers;

import models.Person;
import models.PhysicalPerson;
import models.database.PhysicalPersonDB;

public class PhysicalPersonDAO extends PersonDAO {

    public PhysicalPersonDAO(){
        database = new PhysicalPersonDB();
    }

    @Override
    public void add(Object o) {
        super.add(o);
    }

    @Override
    public void remove(Object o) {
        o = (PhysicalPerson) o;
        database.removePerson((Person) o);
    }

    @Override
    public Object search(Object o) {
        return super.search(o);
    }

    @Override
    public void change(Object o) {
        super.change(o);
    }
}

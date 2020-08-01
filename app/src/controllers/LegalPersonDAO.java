package controllers;
import models.LegalPerson;
import models.LegalPersonDB;
import models.Person;

public class LegalPersonDAO extends PersonDAO {

    public LegalPersonDAO() {
        database = new LegalPersonDB();
    }


    @Override
    public void add(Object o) {
        if(o instanceof LegalPerson){
            Person person = (Person) o;
            database.addPerson(person);
        }
    }

    @Override
    public void remove(Object o) {
        if(o instanceof LegalPerson){
            Person person = (Person) o;
            database.removePerson(person);
        }
    }

    @Override
    public void search(Object o) {

    }

    @Override
    public void change(Object o) {
        super.change(o);
    }

}

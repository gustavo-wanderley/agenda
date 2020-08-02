package controllers;
import models.LegalPerson;
import models.database.LegalPersonDB;
import models.Person;
import models.info.CNPJ;

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
    public Object search(Object o) {
        if(o instanceof CNPJ){
            LegalPerson legalPerson = new LegalPerson(null, (CNPJ) o, null, null);
            return database.searchPerson(legalPerson);
        }
        return null;
    }

    @Override
    public void change(Object o) {
        super.change(o);
    }

}

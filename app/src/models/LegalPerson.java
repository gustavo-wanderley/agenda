package models;

import models.info.Address;
import models.info.Document;
import models.info.Phone;

public class LegalPerson extends  Person{

    public LegalPerson(String name, Document document, Phone phone, Address address){
        setName(name);
        setDocument(document);
        setPhone(phone);
        setAddress(address);
    }

    @Override
    public String toString() {
        return "Nome: " + getName() + getDocument();
    }

}

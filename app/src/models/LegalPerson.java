package models;

public class LegalPerson extends  Person{

    public LegalPerson(String name, Document document, Phone phone, Address address){
        setName(name);
        setDocument(document);
        setPhone(phone);
        setAddress(address);
    }

}

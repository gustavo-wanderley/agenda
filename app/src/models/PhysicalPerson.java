package models;

public class PhysicalPerson extends Person{

    public PhysicalPerson(String name, Document document, Phone phone, Address address){
        setName(name);
        setDocument(document);
        setPhone(phone);
        setAddress(address);
    }

}

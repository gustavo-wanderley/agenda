package controllers;

import models.LegalPerson;
import models.Person;
import models.PhysicalPerson;
import models.info.Address;
import models.info.CNPJ;
import models.info.Document;
import models.info.Phone;
import view.Agenda;
import view.UI;

public class LegalPersonAgenda extends Agenda  {

   public LegalPersonAgenda(){
        dao = new LegalPersonDAO();

    }


    @Override
    public void menu() {
        super.menu();
        System.out.println("[1] cadastrar pessoa juridica");
        System.out.println("[2] buscar pessoa juridica");
        System.out.println("[3] alterar dados pessoa fisica");
        System.out.println("[4] remover");
    }


    @Override
    public Person createPerson() {
        String name = UI.inputName();

        Phone phone = UI.inputPhone();

        Address address = UI.inputAddress();

        CNPJ cnpj = UI.inputCnpj();

        return new PhysicalPerson(name, cnpj, phone, address);

    }

    @Override
    public Document inputParameterSearch() {
       return UI.inputCnpj();
    }
}

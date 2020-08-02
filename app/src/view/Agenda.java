package view;

import controllers.DAO;
import models.Person;
import models.info.Document;

public abstract class Agenda {
    protected DAO dao;

    public Person createPerson(){
        return null;
    }


    public void start(){
        menu();
        int action = UI.inputOp();
        op(action);
    }

    public void menu(){
        System.out.println("Menu do Ações");
    }


    public void op(int action){
        switch (action){
            case 1:
                Person person = createPerson();
                dao.add(person);
                // criar pessoa
                break;
            case 2:
                Document document = inputParameterSearch();
                Object obj = dao.search(document);
                Person p = (Person) obj;
                System.out.println(p);
                // buscar
                break;
            case 3:
                // alterar
                break;
            case 4:
                // remover
                break;
            default:
                System.out.println("Invalido");

        }
    }

    abstract public Document inputParameterSearch();
}

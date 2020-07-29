package controllers;

import models.LegalPersonDB;

public class LegalPersonDAO extends PersonDAO {

    public LegalPersonDAO() {
        database = new LegalPersonDB();
    }


    @Override
    public void add(Object o) {
        super.add(o);
    }

    @Override
    public void remove(Object o) {
        super.remove(o);
    }

    @Override
    public void search(Object o) {
        super.search(o);
    }

    @Override
    public void change(Object o) {
        super.change(o);
    }

}

package controllers;

import models.PhysicalPersonDB;

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

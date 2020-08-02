package controllers;

import models.database.DB;

public abstract class PersonDAO implements DAO {
    protected DB database;

    @Override
    public void add(Object o) {

    }

    @Override
    public void remove(Object o) {

    }

    @Override
    public Object search(Object o) {
        return null;
    }

    @Override
    public void change(Object o) {

    }
}


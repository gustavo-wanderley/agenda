package models;

public class CPF extends Document{
    public CPF(){

    }
    @Override
    public String toString() {
        return "CPF: " + this.getNumber();
    }
}

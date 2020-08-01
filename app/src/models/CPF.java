package models;

public class CPF extends Document{
    public CPF(String number){
        setNumber(number);

    }
    @Override
    public String toString() {
        return "CPF: " + this.getNumber();
    }
}

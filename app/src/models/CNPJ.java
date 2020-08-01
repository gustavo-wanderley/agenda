package models;

public class CNPJ  extends Document{

    public CNPJ(String number){
        setNumber(number);
    }
    @Override
    public String toString() {
        return "CNPJ: "+ this.getNumber();
    }
}

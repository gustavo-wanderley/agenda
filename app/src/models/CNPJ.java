package models;

public class CNPJ  extends Document{

    public CNPJ(){

    }
    @Override
    public String toString() {
        return "CNPJ: "+ this.getNumber();
    }
}

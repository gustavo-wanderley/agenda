package models;

public abstract class Document {
    private String number;

    public Document(){

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

package view;

import models.*;

import java.util.Scanner;

public class UI {

    static Scanner scanner = new Scanner(System.in);

    static public Document inputCpf(){
        String cpf;
        cpf = scanner.next();
        return new CPF(cpf);
    }


    static  public Document inputCnpj(){
        String cnpj;
        cnpj = scanner.next();
        return new CNPJ(cnpj);
    }

    static public Address inputAddress(){
        String street;
        String numberHouse;
        String city;
        String state;
        String country;
        System.out.printf("número da rua:");
        street = scanner.next();
        System.out.printf("número da casa:");
        numberHouse = scanner.next();
        System.out.printf("nome da cidade:");
        city = scanner.next();
        System.out.printf("estado:");
        state = scanner.next();
        System.out.printf("nome do país:");
        country = scanner.next();

        return new Address( street, numberHouse, city, state, country);
    }


    static public Phone inputPhone(){
        int number;
        number = scanner.nextInt();

        return new Phone(number);
    }


}

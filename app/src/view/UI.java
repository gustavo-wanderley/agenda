package view;

import models.info.*;

import java.lang.reflect.Parameter;
import java.util.Scanner;

public class UI {

    static Scanner scanner = new Scanner(System.in);

    static public CPF inputCpf(){
        String cpf;
        System.out.println("Número da CPF:");
        cpf = scanner.next();
        return new CPF(cpf);
    }


    static  public CNPJ inputCnpj(){
        String cnpj;
        System.out.println("Número da CNPJ:");
        cnpj = scanner.next();
        return new CNPJ(cnpj);
    }

    static public Address inputAddress(){
        String street;
        String numberHouse;
        String city;
        String state;
        String country;
        System.out.printf("Número da rua:");
        street = scanner.next();
        System.out.printf("Número da casa:");
        numberHouse = scanner.next();
        System.out.printf("Nome da cidade:");
        city = scanner.next();
        System.out.printf("Nome do estado:");
        state = scanner.next();
        System.out.printf("Nome do país:");
        country = scanner.next();

        return new Address( street, numberHouse, city, state, country);
    }


    static public Phone inputPhone(){
        int number;
        System.out.println("Número do telefone:");
        number = scanner.nextInt();
        return new Phone(number);
    }

    static public String inputName(){
        String name;
        System.out.println("Digite seu nome:");
        name = scanner.next();
        return name;
    }


    static public int inputOp(){
        int op;
        System.out.println("digite sua op:");
        op = scanner.nextInt();
        return op;
    }



    static public void menu(){
        System.out.println("Bem vindo ao sistema de Agenda");
        System.out.println("[1] Pessoa Fisica");
        System.out.println("[2] Pessoa Juridica");
    }
}

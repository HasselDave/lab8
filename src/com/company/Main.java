package com.company;

public class Main {

    public static void main(String[] args) {
        //Problema1
        System.out.println("Problema 1");
        Person Ana =new Person("Ana",12,"maaaaaa");
    Ana.setName("Maria");
    System.out.println(Ana.getName());

    //Problema3
        System.out.println("Problema 3");
        Drawable[] arr;
        arr= new Drawable[2];
        arr[0]= new Circle(15);
        arr[1]= new Triangle(20,10);
        arr[0].draw();
        arr[1].draw();


     //problema4
        System.out.println("Problema 4");
        BankAccount cont= new BankAccount();
        cont.setBalance(150);
        cont.setSumaextrasa(50);
        cont.setSumadep(20);
        System.out.println("Current balance is: " + cont.getBalance());
        cont.deposit();
        cont.withdraw();


        //problema5
        System.out.println("Problema 5");
        Auto masina = new Auto("Audi");
        masina.start();
        masina.stop();
        Moto motocic= new Moto("Yamaha");
        motocic.start();
        motocic.stop();
    }

}

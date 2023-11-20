//problema 5
package com.company;

abstract class Vehicle {

    public abstract void start();
    public abstract void stop();

}

class Auto extends Vehicle{
    private String numemasina;

    public Auto(String numemasina){
        this.numemasina=numemasina;
    }

    public void start(){
        System.out.println(this.numemasina + " a pornit!");
    }
    public void stop(){
        System.out.println(this.numemasina + " s-a oprit!");
    }
}

class Moto extends Vehicle{
    private String numemoto;

    public Moto(String numemoto){
        this.numemoto=numemoto;
    }

    public void start(){
        System.out.println(this.numemoto + " a pornit!");
    }
    public void stop(){
        System.out.println(this.numemoto + " s-a oprit!");
    }
}


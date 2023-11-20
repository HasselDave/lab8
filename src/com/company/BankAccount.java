//Problema4
// la incapsulare nu avem constructor dar folosim getter si setter pentru atribute

package com.company;

public class BankAccount {
    private double balance;
    private double sumaextrasa;
    private double sumadep;


    public double getBalance() {
        return balance;
    }

    public double getSumaextrasa() {
        return sumaextrasa;
    }

    public double getSumadep(){
        return sumadep;
    }

    public void setSumadep(double sumadep){
        this.sumadep=sumadep;
    }

    public void setSumaextrasa(double sumaextrasa){
        this.sumaextrasa=sumaextrasa;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit() {
        this.balance= this.balance + this.sumadep;
        System.out.println("Suma depozitata!; Current balance is: " + this.balance);
    }

    public void withdraw() {
        this.balance = this.balance - this.sumaextrasa;
        System.out.println("Actiune realizata cu succes!; Current balance is: " + this.balance);
    }

}

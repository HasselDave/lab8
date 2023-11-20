//Problema1
package com.company;

public class Person {
    String name;
    int age;
    String adress;

    public String getName() {
        return name;
    }

    public void setName(String newName){
        this.name=newName;
    }


    public Person (String nume, int age, String adress){
        this.name = name;
        this.age = age;
        this.adress = adress;
    }
}

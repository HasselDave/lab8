//problema2
package com.company;

abstract class Shape
{
    public abstract double calculArie();

}

class Dreptunghi extends Shape{
    private double lungime, latime;

    public Dreptunghi( double lungime, double latime){
        this.latime=latime;
        this.lungime=lungime;
    }

    public double calculArie(){
        return lungime*latime;
    }
}

 class Cerc extends Shape{
    private double raza;

    public Cerc(double raza){
        this.raza=raza;
    }

    public double calculArie(){
        return raza*3.14;
    }

 }

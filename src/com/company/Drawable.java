package com.company;

interface Drawable {
    public void draw();
}

class Circle implements Drawable{
    private double raza;

    public Circle(double raza){
        this.raza=raza;
    }
    public void draw(){
        System.out.println("Aria cercului este: " + 2* this.raza *Math.PI);
    }
}

class Triangle implements Drawable{
    private double latura, inaltime;

    public Triangle(double latura, double inaltime){
        this.latura=latura;
        this.inaltime=inaltime;
    }

    public void draw(){
        System.out.println("Aria triunghiului este: " + this.latura*this.inaltime/2);
    }
}

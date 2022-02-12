package com.company;

abstract class Car
{
    public short speed;
    private String model;
    private float weight;
    private String color;
    private boolean iswork;
    Car (short speed){
this.speed=speed;
    }
    Car (String model,float weight,String color,boolean iswork) {
        this.model =model;
        this.weight =weight;
        this.color =color;
        this.iswork =iswork;
        printAll();


    }
    public  void SetAll(String model,float weight,String color,boolean iswork){
        this.model =model;
        this.weight =weight;
        this.color =color;
        this.iswork =iswork;


}
     void printAll(){
        String iswork=this.iswork ? "Работает" : "не работает";
     System.out.println("Автомобиль марки "+this.model+" имеет скорость "+this.speed +" и Вес "+ this.weight + " его цвет "
             +this.color+ " и он "+ iswork);
    }
    abstract void startEngine();


    }


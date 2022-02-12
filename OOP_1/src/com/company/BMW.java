package com.company;
public class BMW extends Car{

private boolean isPerforments;
    BMW(boolean isPerforments, String model, float weight, String color, boolean iswork,short speed) {
        super(model, weight, color, iswork);
        this.isPerforments=isPerforments;
        super.speed=speed;
    }

    void printAll(){
        super.printAll();
        String isPerforments=this.isPerforments ? "Является" : "Не является";
        System.out.println("Машина " + isPerforments+" с перформенс");

    }

    @Override
    void startEngine() {
        System.out.println("машина заводится с кнопки");
    }
}

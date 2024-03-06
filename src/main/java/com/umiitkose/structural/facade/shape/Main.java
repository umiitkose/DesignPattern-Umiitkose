package com.umiitkose.structural.facade.shape;

public class Main {
    public static void main(String[] args) {
        //Facade ile
        ShapeFacade shapeFacade=new ShapeFacade();
        shapeFacade.drawCircle();
        shapeFacade.drawRectangle();
        shapeFacade.drawTriangle();

        //Facade olmasaydı
        Circle circle =new Circle();
        circle.draw();
    }
}

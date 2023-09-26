package org.example;

public class PC {
    private Case aCase;
    private MotherBoard motherBoard;
    private  Monitor monitor;

    public PC(Case aCase, MotherBoard motherBoard, Monitor monitor) {
        this.aCase = aCase;
        this.motherBoard = motherBoard;
        this.monitor = monitor;
    }
    private static void drawLogo(){
        Monitor.drawPixel(10,10,"Purple");
    }
    public void description(){
        System.out.println("Welcome to worst buy, below is the description of the pc on sale today." + "\n" + aCase.toString() + "\n" + motherBoard.toString() + "\n" + monitor.toString());
    }
    public void powerUp(){
        Case.pressPowerButton();
        drawLogo();
        MotherBoard.loadProgram("Photoshop");
    }
}

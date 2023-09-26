package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Dimension dimension = new Dimension(200, 200, 100);
        Case aCase = new Case("Windows XP", "Microsoft", "220 volts",dimension);
        MotherBoard motherBoard = new MotherBoard("Sony23","Sony",2,4,"Sony bios");
        Resolution resolution = new Resolution(50,50);
        Monitor monitor = new Monitor(resolution,"HP24m","HP");
    PC pc = new PC(aCase,motherBoard,monitor);
    pc.description();
    pc.powerUp();
    }
}
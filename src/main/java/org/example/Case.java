package org.example;

public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    Dimension dimension;

    public Case(String model, String manufacturer, String powerSupply, Dimension dimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
    }

    public static String pressPowerButton(){
        return "Power Button Pressed";
    }

    @Override
    public String toString() {
        return "Case{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", powerSupply='" + powerSupply + '\'' +
                ", dimension=" + dimension +
                '}';
    }
}

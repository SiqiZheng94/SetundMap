package org.example;

public class Meduction {
    private String name;
    private double price;
    private boolean availability;

    public Meduction(String name, double price, boolean availability) {
        this.name = name;
        this.price = price;
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean getAvailability() {
        return availability;
    }

    @Override
    public String toString() {
        return "Meduction{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", availability=" + availability +
                '}';
    }
}

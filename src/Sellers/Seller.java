package Sellers;

import java.util.ArrayList;
import Cars.Car;

public class Seller {
    private String name;
    private String surname;
    private double sallary;
    private double bonuss;
    private ArrayList<Car> soldCars;

    public Seller(String name, String surname, double sallary) {
        this.name = name;
        this.surname = surname;
        this.sallary = sallary;
    }

    public String getName() {
        return name;
    }

    public double getBonuss() {
        return bonuss;
    }

    public void setBonuss(double bonuss) {
        this.bonuss += bonuss;
    }
}

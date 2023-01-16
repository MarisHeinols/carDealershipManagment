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

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSallary() {
        return sallary;
    }

    public void setSallary(double sallary) {
        this.sallary = sallary;
    }

    public double getBonuss() {
        return bonuss;
    }

    public void setBonuss(double bonuss) {
        this.bonuss += bonuss;
    }
}

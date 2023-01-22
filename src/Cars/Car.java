package Cars;

import Cars.parts.CarType;
import Cars.parts.Engine;
import Cars.parts.Transmition;

public class Car {
    private final String manufacture;
    private final String model;
    private final int year;
    private final Engine engine;
    private final CarType type;
    private final Transmition transmition;

    private final double wight;
    private final double length;
    private final int hp;
    private double price;

    public Car(String manufacture, String model, int year, Engine engine,
               CarType type, Transmition transmition, int hp,
               double wight, double length , double price) {
        this.manufacture = manufacture;
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.type = type;
        this.transmition = transmition;
        this.hp = hp;
        this.wight = wight;
        this.length = length;
        this.price = price;
    }
    public double getWight() {
        return wight;
    }

    public double getLength() {
        return length;
    }


    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Cars.car{" +
                "manufacture='" + manufacture + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", Cars.parts.engine=" + engine +
                ", type=" + type +
                ", Cars.parts.transmission=" + transmition +
                ", hp=" + hp +
                '}';
    }
}

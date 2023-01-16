package Cars;

import Cars.parts.CarType;
import Cars.parts.Engine;
import Cars.parts.Transmition;

public class CarBuilder implements Builder{

    private String manufacture;
    private String model;
    private int year;
    private Engine engine;
    private CarType type;
    private Transmition transmition;

    private double wight;
    private double length;
    private int hp;
    private double price;


    @Override
    public void setManufacture(String manufacture){
        this.manufacture = manufacture;
    };
    @Override
    public void setModel(String model){
        this.model = model;
    };
    @Override
    public void setEngine(Engine engine){
        this.engine = engine;
    };
    @Override
    public void setType(CarType type){
        this.type = type;
    };
    @Override
    public void setYear(int year){
        this.year = year;
    };
    @Override
    public void setTransmition(Transmition transmition){
        this.transmition = transmition;
    };
    @Override
    public void setWight(double wight){
        this.wight = wight;
    };
    @Override
    public void setLength(double length){
        this.length = length;
    };
    @Override
    public void setPrice(double price){
        this.price = price;
    };
    @Override
    public void setHp(int hp){
        this.hp = hp;
    };

    public Car getProduct(){
        return new Car(manufacture,model,year,engine,
                type,transmition,hp,wight,length,price);
    }
}

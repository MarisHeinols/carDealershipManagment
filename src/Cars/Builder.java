package Cars;

import Cars.parts.CarType;
import Cars.parts.Engine;
import Cars.parts.Transmition;

public interface Builder {
    void setManufacture(String brand);
    void setModel(String model);
    void setEngine(Engine engine);
    void setType(CarType type);
    void setYear(int year);
    void setTransmition(Transmition transmition);
    void setWight(double wight);
    void setLength(double length);
    void setPrice(double price);
    void setHp(int hp);


}

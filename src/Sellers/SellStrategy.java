package Sellers;
import Cars.Car;
public interface SellStrategy {
    boolean sell(Car car);
    void addBonus(Seller seller, Car car);
}

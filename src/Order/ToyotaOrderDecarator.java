package Order;

import Cars.Car;

public class ToyotaOrderDecarator extends OrderDecarator{
    public ToyotaOrderDecarator(Order source) {
        super(source);
    }

    @Override
    public void addItem(Car car) {
        super.addItem(car);
    }
    @Override
    public void setCost(double cost) {
        super.setCost(cost * getToyotaManufactureDiscount());

    }

    @Override
    public double getCost() {
        return super.getCost();
    }

    public double getToyotaManufactureDiscount() {
        return 0.2;
    }
}

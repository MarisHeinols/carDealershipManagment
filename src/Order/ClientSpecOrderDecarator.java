package Order;

import Cars.Car;

public class ClientSpecOrderDecarator extends OrderDecarator{

    public ClientSpecOrderDecarator(Order source) {
        super(source);
    }

    @Override
    public void addItem(Car car) {
        super.addItem(car);
    }

    @Override
    public void setCost(double cost) {
        super.setCost(cost + costIncreaseForSpecOrder());
    }

    @Override
    public double getCost() {
        return super.getCost();
    }

    public double costIncreaseForSpecOrder(){
        return 2500.99;
    }

}

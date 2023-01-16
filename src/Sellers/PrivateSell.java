package Sellers;

import Cars.Car;

public class PrivateSell implements SellStrategy{
    public String name;
    public String surname;
    public double funds;
    public double credit;

    public PrivateSell(String name, String surname, double funds, double credit) {
        this.name = name;
        this.surname = surname;
        this.funds = funds;
        this.credit = credit;
    }

    @Override
    public boolean sell(Car car){
        if(car.getPrice()<funds && credit <= car.getPrice()*0.5){
            return true;
        }
        return false;
    }
    @Override
    public void addBonus(Seller seller, Car car){
        double bonus = car.getPrice() * 0.6;
        seller.setBonuss(bonus);
    }
}


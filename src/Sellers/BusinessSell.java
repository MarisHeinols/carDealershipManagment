package Sellers;
import Cars.Car;
public class BusinessSell implements SellStrategy{
    private String companyName;
    private String companyOwner;

    private double availableFounds;

    public BusinessSell(String companyName, String companyOwner, double availableFounds) {
        this.companyName = companyName;
        this.companyOwner = companyOwner;
        this.availableFounds = availableFounds;
    }

    @Override
    public boolean sell(Car car){
        if(car.getPrice()<availableFounds){
            return true;
        }
        return false;
    }
    @Override
    public void addBonus(Seller seller, Car car){
        double bonus = car.getPrice() * 0.3;
        seller.setBonuss(bonus);
    }
}

import Cars.Car;
import Cars.CarBuilder;
import Cars.parts.*;
import Sellers.Seller;
import Sellers.BusinessSell;
import Sellers.PrivateSell;
import Storage.ShowRoom;
import Storage.Storage;
import Storage.utils.StorageAdapter;
import Storage.CarDelivery;

import java.util.ArrayList;

public class Main {
    // Car dealership management system
    //Design patterns in use:
    //Construction - builder used to create cars
    //Structural - adapter used in fitting cars in showroom or storage
    //Behavioral - strategy used to determine different strategies to sell cars
    //
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();

        //Director orders new cars from manufactures
        ArrayList<Car> cars = new ArrayList<Car>();
        director.constructHondaSuv(builder);
        cars.add(builder.getProduct());

        director.constructHondaHatch(builder);
        cars.add(builder.getProduct());

        director.constructToyotaSuv(builder);
        cars.add(builder.getProduct());

        director.constructToyotaSedan(builder);
        cars.add(builder.getProduct());

        director.constructToyotaSportsCar(builder);
        cars.add(builder.getProduct());

        //Sellers in dealership
        Seller sellerOne = new Seller("Andrej","Random",1200);
        Seller sellerTwo = new Seller("Bob","Dob",850);

        //Show room and storage declaration
        ShowRoom showRoom = new ShowRoom(5.0);
        Storage storage = new Storage(50.0);

        //Array list where store cars that will be delivered
        CarDelivery carDelivery = new CarDelivery(cars);

        //Array where to store cars that don`t fit in showroom and need to be moved
        ArrayList<Car> carsThatDontfit = new ArrayList<Car>();

        //Adapter to calculate the biggest square in circular showroom to see if cars fit
        StorageAdapter storageAdapterOne = new StorageAdapter(showRoom);

        //Checking if cars fit in showroom
        if(carDelivery.fits(storageAdapterOne)){
            System.out.println("All cars fit moving all in show room");
        }else{
            // If cars don`t fit move car by car to storage till cars fit showroom
            for(Car car:carDelivery.getCars()){
                carsThatDontfit.add(car);
                cars.remove(car);
                carDelivery = new CarDelivery(cars);
                if(carDelivery.fits(storageAdapterOne)){
                    break;
                }

            }
            System.out.println(cars.size() + " cars were stored in show room");
            showRoom.setStoredCars(cars);
            System.out.println(carsThatDontfit.size() + " cars were moved to storage");
            storage.setStoredCars(carsThatDontfit);
        }

        // Create new private sell strategy for a new sale
        PrivateSell firstSale = new PrivateSell("John","Doe",25.00,10.00);

        //Check if the private buyer can afford the car
        if(firstSale.sell(showRoom.getStoredCars().get(0))){
            firstSale.addBonus(sellerOne,showRoom.getStoredCars().get(0));
            System.out.println(sellerOne.getName() + " sold his first car now he`s bonus is - " + sellerOne.getBonuss());
        }else{
            System.out.println("buyer can`t afford to buy");
        }

        // Create new private sell strategy for a new sale
        PrivateSell secSale = new PrivateSell("John","Doe",75.00,10.00);

        //Check if the private buyer can afford the car
        if(secSale.sell(showRoom.getStoredCars().get(0))){
            secSale.addBonus(sellerOne,showRoom.getStoredCars().get(0));
            System.out.println(sellerOne.getName() + " sold his first car now he`s bonus is - " + sellerOne.getBonuss());
        }else{
            System.out.println("buyer can`t afford to buy");
        }

        // Create new corporate sell strategy for a new sale
        BusinessSell thirdSale = new BusinessSell("SmithJobs","Smith Jobs",2303030.0);

        //Check if the corporate buyer can afford the car
        if(thirdSale.sell(showRoom.getStoredCars().get(1))){
            thirdSale.addBonus(sellerTwo,showRoom.getStoredCars().get(1));
            System.out.println(sellerTwo.getName() + " sold his first car now he`s bonus is - " + sellerTwo.getBonuss());
        }else{
            System.out.println("buyer can`t afford to buy");
        }


    }
}
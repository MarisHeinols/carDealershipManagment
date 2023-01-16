package Cars.parts;

import Cars.Builder;

public class Director {
    public void constructHondaSuv(Builder builder){
        builder.setManufacture("Honda");
        builder.setModel("CRV");
        builder.setEngine(new Engine("Hybrid",2.5,false));
        builder.setType(CarType.SUV);
        builder.setYear(2020);
        builder.setTransmition(Transmition.AUTOMATIC);
        builder.setWight(1.7);
        builder.setLength(2.0);
        builder.setPrice(32000);
        builder.setHp(210);
    }
    public void constructHondaHatch(Builder builder){
        builder.setManufacture("Honda");
        builder.setModel("Civic");
        builder.setEngine(new Engine("Petrol",2.0,true));
        builder.setType(CarType.HATCH_BACK);
        builder.setYear(2021);
        builder.setTransmition(Transmition.AUTOMATIC);
        builder.setWight(1.7);
        builder.setLength(2.0);
        builder.setPrice(42000);
        builder.setHp(320);
    }
    public void constructToyotaSedan(Builder builder){
        builder.setManufacture("Toyota");
        builder.setModel("Camry");
        builder.setEngine(new Engine("Hybrid",3.5,false));
        builder.setType(CarType.SEDAN);
        builder.setYear(2022);
        builder.setTransmition(Transmition.AUTOMATIC);
        builder.setWight(1.8);
        builder.setLength(2.2);
        builder.setPrice(52000);
        builder.setHp(410);
    }
    public void constructToyotaSuv(Builder builder){
        builder.setManufacture("Toyota");
        builder.setModel("Rav4");
        builder.setEngine(new Engine("Petrol",1.6,true));
        builder.setType(CarType.SUV);
        builder.setYear(2020);
        builder.setTransmition(Transmition.AUTOMATIC);
        builder.setWight(1.9);
        builder.setLength(2.4);
        builder.setPrice(36200);
        builder.setHp(250);
    }
    public void constructToyotaSportsCar(Builder builder){
        builder.setManufacture("Toyota");
        builder.setModel("Supra");
        builder.setEngine(new Engine("Petrol",3.0,true));
        builder.setType(CarType.SPORTS_CAR);
        builder.setYear(2020);
        builder.setTransmition(Transmition.AUTOMATIC);
        builder.setWight(1.7);
        builder.setLength(2.0);
        builder.setPrice(72990);
        builder.setHp(520);
    }
}

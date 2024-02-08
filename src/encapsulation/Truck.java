package encapsulation;

public class Truck extends Vehicle{
    public Truck(String make,String model, int year, String FuelType){
        super(make, model, year,FuelType);
    }

    public int fuelEfficiency(int constrYear){
        short fuel_efficiency;
        if(constrYear <= 2000)
            fuel_efficiency=6;
        else if(constrYear>2000 && constrYear<2008)
            fuel_efficiency=12;
        else if(constrYear>=2008 && constrYear<2016)
            fuel_efficiency=18;
        else if(constrYear>=2016 && constrYear<=2024)
            fuel_efficiency=24;
        else
            fuel_efficiency=25;
        return fuel_efficiency;
    }

    public int distTravalCalc(short fuel_efficiency,int year){
        int distance=80000*(2025-year);
        return distance;
    }

    public short maxSpeed(short year){
        return (short) (year/15);
    }
}

package encapsulation;

public class Motorcycle extends Vehicle{
    public Motorcycle(String make,String model, int year, String FuelType){
        super(make, model, year, FuelType);
    }

    public int fuelEfficiency(int constrYear){
        short fuel_efficiency;
        if(constrYear <= 2000)
            fuel_efficiency=9;
        else if(constrYear>2000 && constrYear<2008)
            fuel_efficiency=15;
        else if(constrYear>=2008 && constrYear<2016)
            fuel_efficiency=22;
        else if(constrYear>=2016 && constrYear<=2024)
            fuel_efficiency=28;
        else
            fuel_efficiency=31;
        return fuel_efficiency;
    }

    public int distTravalCalc(short fuel_efficiency,int year){
        int distance=20000*(2025-year);
        return distance;
    }

    public short maxSpeed(short year){
        return (short) (year/10);
    }
}

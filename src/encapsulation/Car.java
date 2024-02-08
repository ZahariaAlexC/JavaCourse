package encapsulation;

public class Car extends Vehicle{
    public Car(String make,String model, int year,String FuelType){
        super(make, model, year, FuelType);
    }

    public int fuelEfficiency(int constrYear){
        if(constrYear <= 2000)
            return 3;
        else if(constrYear<2008)
            return 5;
        else if(constrYear<2016)
            return 8;
        else if(constrYear<=2024)
            return 9;

        return 10;
    }

    public int distTravalCalc(int year){
        return 45000*(2025-year);
    }

    public short maxSpeed(short year){
        return (short) (year/8);
    }
}

package encapsulation;


public class VehicleTest {
    public static void display(Vehicle vehicle) {
        System.out.println("Make: " + vehicle.make+"\t\tModel: " + vehicle.model+"\t\tYear:" + vehicle.year+"\t\tFuel Type: " + vehicle.FuelType);
    }
    public static void main(String[] args) {
        Motorcycle motorcycle=new Motorcycle("Harley","Davidson",2009, "Diesel");
        Truck truck=new Truck("FORD","F-150",2022,"Diesel");
        Car car=new Car("Ferrari","Spider 488",2017, "Petrol");
        Vehicle vehicle = new Vehicle("Ferrari","Spider 488",2017, "Petrol");
        display(motorcycle);
        System.out.print("Fuel efficiency: "+motorcycle.fuelEfficiency(motorcycle.year));
        System.out.print("\t\tTraveled distance: "+motorcycle.distTravalCalc(motorcycle.fuelEfficiency(motorcycle.year)));
        System.out.print("\t\tMaximum speed: "+motorcycle.maxSpeed((short) motorcycle.year)+"\n\n");

        display(truck);
        System.out.print("Fuel efficiency: "+truck.fuelEfficiency(truck.year));
        System.out.print("\t\tTraveled distance: "+truck.distTravalCalc(truck.fuelEfficiency(truck.year)));
        System.out.print("\t\tMaximum speed: "+truck.maxSpeed((short) truck.year)+"\n\n");

        display(car);
        System.out.print("Fuel efficiency: "+car.fuelEfficiency(car.year));
        System.out.print("\t\tTraveled distance: "+car.distTravalCalc(car.fuelEfficiency(car.year)));
        System.out.print("\t\tMaximum speed: "+car.maxSpeed((short) car.year));
        getVehicle(vehicle);
        String text = getVehicle(motorcycle).model;
//        getTruck(car);


    }


    private static <T> T getVehicle(T vehicle){
            return vehicle;
    }


    private static Truck getTruck(Truck truck){
        return truck;
    }


}

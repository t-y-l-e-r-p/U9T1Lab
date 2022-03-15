public class VehicleRunner
{
  public static void main(String[] args)
  { 
    // testing all available methods on a Vehicle object
    Vehicle myVehicle = new Vehicle("Some Vehicle", 6);
    System.out.println(myVehicle.getName());
    System.out.println(myVehicle.getWheels());
    myVehicle.move(10);
    myVehicle.turn(90);
    myVehicle.brake(0.25);
    
    // testing all available methods on a Car object
    Car myCar = new Car("Honda Civic", 4, "leather");
    System.out.println(myCar.getName()); // inherited method
    System.out.println(myCar.getWheels()); // inherited method
    System.out.println(myCar.getFabric()); // method ONLY available on Car objects
    myCar.move(30); // inherited method
    myCar.turn(-90); // inherited method
    myCar.brake(0.50); // inherited method
    myCar.honk(); // method ONLY available on Car objects
    myCar.lockDoors(); // method ONLY available on Car objects
 
    // ---- WRITE YOUR TEST CODE BELOW! ----
    // testing all available methods on a Bicycle object

    Bicycle myBike = new Bicycle("randy", 4 , 4);
    System.out.println(myBike.getGearCount());
    System.out.println(myBike.getName());
    System.out.println(myBike.getWheels());
    System.out.println(myBike.getClass());
    myBike.turn(70);
    myBike.brake(4);
    myBike.move(70);

    Boat myBoat = new Boat("Tim", 0 , 2008 , 400);
    System.out.println(myBoat.getYear());
    System.out.println(myBoat.getName());
    System.out.println(myBoat.getWheels());
    System.out.println(myBoat.getClass());
    System.out.println(myBoat.getMiles());
    myBoat.turn(70);
    myBoat.brake(4);
    myBoat.move(70);
    myBoat.boost();


    
    
    
    
    
        
  }
}
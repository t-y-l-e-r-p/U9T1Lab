public class Bicycle extends Vehicle{

    private int gearCount = 0;
    public Bicycle(String name, int wheels, int gearCount)
    {
        super(name, wheels);
        this.gearCount = gearCount;
    }
    public void ringBell()
    {
        System.out.println("The bell is rung");
    }
    public int getGearCount()
    {
        return gearCount;
    }
}

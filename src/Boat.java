public class Boat extends Vehicle{
    private int year;
    private int miles;
    public Boat(String name, int wheels, int year, int miles)
    {
        super(name, wheels);
        this.year = year;
        this.miles = miles;
    }
    public int getYear()
    {
        return year;
    }
    public int getMiles()
    {
        return miles;
    }
    public void boost()
    {
        System.out.println("The boat has boosted using extra fuel");
    }
}

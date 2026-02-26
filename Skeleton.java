public class Skeleton extends Monster {
    private double speed;

    public Skeleton()
    {
        speed = 100;
    }

    public Skeleton(String name)
    {
        super(name);
        speed = 100;
    }

    public Skeleton(String name, double speed)
    {
        super(name);
        this.speed=speed;
    }

    public String toString()
    {
        //return "The skeletons speed is " + speed + ", and his name is " + super.getName();
        return super.toString() + "Speed :: " + speed + "\n";
    }
    
}

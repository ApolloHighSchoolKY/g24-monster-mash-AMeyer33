public class Demon extends Monster {

    private int numOfClaws;

    public Demon(String name, int num)
    {
        super(name);
        numOfClaws = num;
    }

    public String obliterate()
    {
        return getName() + " obliterated the ground beneath him!\n";
    }

    public String screech()
    {
        return getName() + " deafened those around him!\n";
    }

    public String scratch()
    {
        return getName() + " scratched you with his " + numOfClaws + " claws!\n";
    }

}

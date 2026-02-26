public class Pig extends Animal {
    
    private int spirals;

    public Pig()
    {
        super(0,"Oink");
        spirals = 0;
    }

    public Pig(int age, int spirals)
    {
        super(age, "OINK");
        this.spirals = spirals;
    }

    public void eat()
    {
		super.eat();
        spirals ++;
    }

    public int getMilk()
    {
		return spirals;
    }
}

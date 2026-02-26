/**
 * Inheritance and Polymorphism
 ***********************************************************
 * This file is an object that will inherit all of the
 * properties and abilities of the original Animal object.
 * However, it will have it own unique properties and
 * methods while overriding some of the existing methods
 * it inherits.
 ***********************************************************
 * @author  Mr. Leohr, February 7th, 2016
 */


public class Cow extends Animal
{
    private int milk;

    public Cow()
    {
        super(0,"Moo");
        milk = 0;
    }

    public Cow(int age, int milk)
    {
        super(age, "MOO");
        this.milk = milk;
    }

    public void eat()
    {
		super.eat();
        milk ++;
    }

    public int getMilk()
    {
		return milk;
    }

    public int getAge()
	{
		return super.getAge();
	}

    public boolean equals(Animal bob)
    {
        boolean age = false;
        boolean type = false;

        if(bob.getAge() == this.getAge())
        {
            age = true;
        }
        if(bob.getClass() == this.getClass())
        {
            type = true;
        }
        return (age && type);
    }

    //public String toString()
    //{
    // 	return super.toString();
    //}

}
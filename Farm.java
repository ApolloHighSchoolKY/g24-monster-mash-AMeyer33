import java.util.ArrayList;

/**
 * @(#)Farm.java
 *
 *
 * @author
 * @version 1.00 2023/3/8
 */


public class Farm {
    public static void main(String[] args)
    {
        ArrayList<Animal> list = new ArrayList<Animal>();

        list.add(new Cow(0, 0));
        list.add(new Pig(1, 2));
        list.add(new Cow(2, 4));
        list.add(new Pig(5, 8));
        list.add(new Pig(5, 8));
        
        for(int i = 0; i < list.size(); i++)
        {
            list.get(i).eat();
            System.out.println("The animal in position " + i + " has eaten.\n");

            list.get(i).speak();
            System.out.println("The animal in position " + i + " goes " + list.get(i).speak() + "\n");

            if(list.get(i).getAge() >= 6)
            {
                list.get(i).kill();
                System.out.println("The animal in position " + i + " died at age " + list.get(i).getAge() + "\n");
            }

            if(i >= 1)
            {
                System.out.println(list.get(i).equals(list.get(i-1)) + "\n");
            }
        }

    }

    }


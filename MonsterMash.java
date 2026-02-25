public class MonsterMash{
  public static void main(String[] args){
    //Monster monster = new Monster(); NOT ALLOWED because Monster has a modified constructor but not a default constructor,
    //Monster does not INHERIT a default constructor
    Monster dracula = new Monster("Dracula");

    System.out.println(dracula);

    System.out.println(dracula.kill());

    Monster sally = new Witch("Sally");

    System.out.println(sally);

    System.out.println(sally.kill());

    System.out.println(((Witch)sally).fly());

    //Declare a Monster of your new Type: Monster sally = new Witch("Sally");
    Monster demon = new Demon("Jeff",2);
    //Declare your new Type of Monster: Witch sally = new Witch("Sally");
    Demon demonKing = new Demon("Demon King Bob", 20);
    
    System.out.println(((Demon)demon).obliterate());
    System.out.println(((Demon)demon).screech());
    System.out.println(demonKing.screech());

    //Bonus: whatever your new monster is, add an instance field
    System.out.println(demonKing.scratch());
  }
}

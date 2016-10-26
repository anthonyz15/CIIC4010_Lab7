
public class Apple implements GameThing, Edible {
	public String getName()

    {

          return "A Shiny red apple";

    }

    public String getDescription()

    {

              return "This is an ordinary apple. It looks like it was picked not too long ago.";

    }
    
    public void eat(){
    	System.out.println("Yuck! The apple was all brown inside. Looks like it wasn't so ripe at all...");
    	AdventureEpsilon.theRoom.removeThing(AdventureEpsilon.theApple);
    }
}

public class Sign implements GameThing, Readable, Edible

{

      public String getName()

      {

            return "A chocolate sign";

      }

      public String getDescription()

      {

                return "This is a small sign, carefully crafted with what seems to be chocolate. There seems to be some partially faded writing in it.";

      }

      public void read()

      {

            System.out.println("You can see the following message: \"John was here!\"");

      }
      public void eat(){
      	System.out.println("That tasted way better than you thought! It's a shame that other people won't be able to read it's message, though.");
      	AdventureEpsilon.theRoom.removeThing(AdventureEpsilon.theSign);
      }

}

 
public class Book implements GameThing, Readable, Openable

{
	public boolean isOpen = false;      //Start out closed
	public String getName()

    {

          return "A dusty old book";

    }

    public String getDescription()

    {

          System.out.println("This book appears to be old and dusty. It's also quite heavy.");
          if(!isOpen){
        	  return("The book is currently closed.");
          }
          else{
        	  return("The book is currently open.");
          }

    }
     
    public void read()

    {
    	if(!isOpen){
    		System.out.println("You can't read closed books!");
        }
        else{
        	System.out.println("It's a book from another place, apparently. None of the words make sense to you.");
        }
          

    }
    
    public void open(){
    	if(!isOpen){
    		System.out.println("The book opens with a creaky sound.");
    		isOpen=true;
    	}
    	else{
    		System.out.println("The book is already open!");
    	}
    }
    
    public void close(){
    	if(!isOpen){
    		System.out.println("The book is already closed!");
    	}
    	else{
    		System.out.println("As the book closes, it makes a loud 'thud' sound.");
    		isOpen=false;
    	}
    }


}


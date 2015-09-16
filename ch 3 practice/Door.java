

/**
 * This is a door 
 * 
 * @author Adrianna 
 * @version 9/15/15
 */
public class Door
{
    /** specifies the name of the door*/
    private String doorName;
    
    /** specifies the state of the door*/
    private boolean doorState;

    /**
     * Constructor for objects of class Door that specifies the name and state of the door
     */
    public Door(String doorName, boolean doorState)
    {
        String name = doorName;
        boolean state = doorState;
    }

    /**
     * Changes the door's state to closed
     *
     * @pre        door must be open or closed
     * @post       door must be closed
     * @param      state of the door
     * 
     */
    public void close(boolean state)
    {
        if (state = true)
        {
            state = false;
        }
        
    }

    public boolean getState()
    {
        return doorState;
    }
    
    
    /**
     * Returns whether the door is open or closed
     * 
     */public String toString()
    {
        String state;
        if (this.getState() == true)
        {
            state = "Open";
        }
        else
        {
            state = "Closed";
        }
        return state;
    }
    
}

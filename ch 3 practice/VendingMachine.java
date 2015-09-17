

/**
 * A vending machine
 * 
 * @author Adrianna Fu
 * @version 9/17/15
 */
public class VendingMachine
{
    /** tracks number of cans in the vending machine */
    private int cans;
    
    /** tracks number of tokens in the vending machine*/
    private int tokens;

    /**
     * Constructor for objects of class VendingMachine that specifies the starting amount of 
     * tokens and cans
     */
    public VendingMachine()
    {
        this.tokens = 0;
        this.cans = 0;
    }

    /**
     * Adds cans to the machine
     *
     * @pre        cansToAdd must be a positive integer
     * @post       cans in vending machine will increase by the amount in the parameter
     * @param      # of cans to put in vending machine
     * 
     */
    public void fillUp(int cansToAdd)
    {
        cans += cansToAdd; 
    }
    
    /**
     * Takes in a token and gives a can
     *
     * @post       One can is exchanged for one token
     * 
     */
    public void insertToken()
    {
        tokens += 1;
        cans -= 1;
    }
    
    /**
     * Returns the value of cans
     *
     * @post      Returns the value of cans
     * @return    # of cans
     */
    public int getCanCount()
    {
        return cans;
    }
    
    /**
     * Returns the value of tokens
     *
     * @post     Returns the value of tokens
     * @return   # of tokens
     */
    public int getTokenCount()
    {
        return tokens;
    }    
    
}

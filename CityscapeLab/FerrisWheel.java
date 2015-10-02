import java.awt.Graphics2D;

import java.awt.Color;

/**
 * A ferris wheel
 * 
 * @author Adrianna Fu 
 * @version 10//15
 */
public class FerrisWheel
{
    /** The x variable of ferris wheel */
    private int xLeft;
    /** The y variable ferris wheel */
    private int yTop;
    /** Diameter of ferris wheel */
    private int diameter;
    
    /**
     * Constructs a ferris wheel at the given coordinates
     * @param x: the x-coordinate of the top left corner of the building
     * @param y: the y-coordinate of the top left corner of the building
     * @param aDiameter: the diameter of the outer circle of the ferris wheel
     */
    public FerrisWheel(int x, int y, int aDiameter)
    {
        xLeft = x;
        yTop = y;
        diameter = aDiameter;
    }

    /**
     * Draws a black rectangle (skyscraper)
     * @param g2: the graphics context
     */
    public void drawFerrisWheel(Graphics2D g2)
    {
        Ellipse2D.Double circle = new Ellipse2D.Double(
    }
    
    /**
     * Draws a fancier building...
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return y;
    }


}

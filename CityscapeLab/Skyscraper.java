// pg 66, 117, 98
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * A tall building with windows on it
 * 
 * @author Adrianna Fu 
 * @version 10/1/15
 */
public class Skyscraper
{
    /** The x variable of the rectangle */
    private int xLeft;
    /** The y variable of the rectangle */
    private int yTop;
    /** The y width of the rectangle */
    private int width;
    /** The height of the rectangle */ 
    private int height;
    /**
     * Constructs a skyscraper at the given coordinates
     * @param x: the x-coordinate of the top left corner of the building
     * @param y: the y-coordinate of the top left corner of the building
     * @param aWidth: the width of the building
     * @param aHeight: the height of the building
     */
    public Skyscraper(int x, int y, int aWidth, int aHeight)
    {
        xLeft = x;
        yTop = y;
        width = aWidth;
        height = aHeight;
    }

    /**
     * Draws a black rectangle (skyscraper)
     * @post a black building will be drawn
     * @param g2: the graphics context
     */
    public void drawRectangle(Graphics2D g2)
    {
        Rectangle skyscraper = new Rectangle(xLeft, yTop, width, height);
        g2.setColor(Color.BLACK);
        g2.fill(skyscraper);
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

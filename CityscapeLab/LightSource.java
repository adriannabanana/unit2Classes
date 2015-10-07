import java.awt.geom.Ellipse2D;
import java.awt.Graphics2D;
import java.awt.Color;

/**
 * Draws a moon or a sun (yellow or white circle)
 * 
 * @Adrianna
 * @10/7/15
 */
public class LightSource
{
     /** The x variable of circle */
    private int xLeft;
    /** The y variable circle */
    private int yTop;
    /** The diameter of the circle */
    private int diameter;
    /**
     * Default constructor for objects of class LightSource
     * @param x the x-coordinate of the top-left corner
     * @param y the y-coordinate of the top-left corner
     */
    public LightSource(int x, int y, int aDiameter)
    {
        xLeft = x;
        yTop = y;
        diameter = aDiameter;
    }

    /**
     * Constructs a moon with a given top left corner
     * @param g2 the graphics context
     */
    public void drawMoon(Graphics2D g2)
    {
        Ellipse2D.Double moon = new Ellipse2D.Double(xLeft,yTop,diameter,diameter);
        g2.setColor(Color.WHITE);
        g2.fill(moon);
    }

    /**
     * Constructs a sun with a given top left corner
     * @param g2 the graphics context
     */
    public void drawSun(Graphics2D g2)
    {
        Ellipse2D.Double sun = new Ellipse2D.Double(xLeft,yTop,diameter,diameter);
        g2.setColor(Color.YELLOW);
        g2.fill(sun);
    }
    
    /**
     * Makes the moon move across the screen
     * @param g2 the graphics context
     */
    public void moonMove(Graphics2D g2)
    {
        xLeft -= 4;
        Ellipse2D.Double moon = new Ellipse2D.Double(xLeft,yTop,diameter,diameter);
        g2.setColor(Color.WHITE);
        g2.fill(moon);
    }
    
    /**
     * Makes the moon move across the screen
     * @param g2 the graphics context
     */
    public void sunMove(Graphics2D g2)
    {
        xLeft -= 4;
        Ellipse2D.Double sun = new Ellipse2D.Double(xLeft,yTop,diameter,diameter);
        g2.setColor(Color.YELLOW);
        g2.fill(sun);
    }
}

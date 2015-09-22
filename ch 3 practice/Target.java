import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * A circle shape
 * 
 * @author Adrianna
 * @version 9/21/15
 */
public class Target
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;

    /**
     * Constructs a car with a given top left corner
     * @param x the x-coordinate of the top-left corner
     * @param y the y-coordinate of the top-left corner
     */
    public Target(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }

    /**
     * Draws a white circle
     * 
     * @param    g2    the graphics context
     * @ param diameter of circle
     */
    public void drawWhite(Graphics2D g2, int diameter)
    {
        Ellipse2D.Double body = new Ellipse2D.Double(xLeft+50, yTop+50, diameter, diameter);
        g2.draw(body);
        g2.setColor(Color.WHITE);
        g2.fill(body);
    }

    public void drawBlack(Graphics2D g2, int diameter)
    {
        Ellipse2D.Double body = new Ellipse2D.Double(xLeft+50, yTop+50, diameter, diameter);
        g2.draw(body);
        g2.setColor(Color.CYAN);
        g2.fill(body);
    }
}

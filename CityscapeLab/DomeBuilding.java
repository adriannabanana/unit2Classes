import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.BasicStroke;

/**
 * A tall building with windows on it
 * 
 * @author Adrianna Fu 
 * @version 10/1/15
 */
public class DomeBuilding
{
    /** The x variable of the building */
    private int xLeft;
    /** The y variable of the building */
    private int yTop;
    /** The y width of the building */
    private int width;
    /** The height of the building */ 
    private int height;
    /**
     * Constructs a dome building at the given coordinates
     * @param x: the x-coordinate of the top left corner of the building
     * @param y: the y-coordinate of the top left corner of the building
     * @param aWidth: the width of the building
     * @param aHeight: the height of the building
     */
    public DomeBuilding(int x, int y, int aWidth, int aHeight)
    {
        xLeft = x;
        yTop = y;
        width = aWidth;
        height = aHeight;
    }

    /**
     * Draws a black rectangle with a semicircle on top (dome building)
     * @post a black dome building will be drawn
     * @param g2: the graphics context
     */
    public void drawDome(Graphics2D g2)
    {
        Rectangle domeRectangle = new Rectangle(xLeft, yTop, width, height);
        g2.setColor(Color.BLACK);
        g2.fill(domeRectangle);
        
        Ellipse2D.Double domeCircle = new Ellipse2D.Double(xLeft, yTop-(width/2), width, width);
        g2.fill(domeCircle);
        
        int xCenter = xLeft + (width/2);
        g2.setStroke(new BasicStroke(5));
        g2.drawLine(xCenter,yTop-100,xCenter,yTop);
        
       
    }
    

    


}

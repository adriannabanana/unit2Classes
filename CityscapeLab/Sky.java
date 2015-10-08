import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Color;

/**
 * The color of the sky (cyan/blue to white)
 * 
 * @author Adrianna Fu
 * @version 10/7/15
 */
public class Sky
{
    /** Color of the sky gradient 1 */
    private Color x;
    /** Color of the sky gradient 2 */
    private Color y;

    /**
     * Constructs the sky with white and a given color
     * @param aColor: one of the colors of the sky
     */
    public Sky(Color aColor)
    {
        x = Color.WHITE;
        y = aColor;
    }

    /**
     * Fills the window with the gradient sky
     * @post the window will be a blue/cyan to white gradient
     * @param g2: the graphics context
     */
    public void skyGradient(Graphics2D g2)
    {
        int w = 800;
        int h = 500;
        GradientPaint gp = new GradientPaint(0,0,y,0,h,x);
        g2.setPaint(gp);
        g2.fillRect(0,0,w,h);
    }
    
}

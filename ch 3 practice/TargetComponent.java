import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Draws multiple circle shapes
 * 
 * @author Adrianna 
 * @version 9/21/15
 */
public class TargetComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        int x = getWidth()-60;
        int y = getHeight()-30;
        int diameter = 200;
        int up = 0;
        int up2 = 5;
        
        int diameter2 = 200;
        int up_ = 0;
        int up_2 = 5;
        
        while (diameter > 5)
        {
            Target target1 = new Target(5+up,5+up);
            target1.drawBlack(g2, diameter);
            diameter -= 10;
            Target target2 = new Target(5+up2,5+up2);
            target2.drawWhite(g2, diameter);
            diameter -= 10;
            up += 10;
            up2 += 10;
        }
        
        while (diameter2 > 5)
        {
            Target target3 = new Target(200+up_,100+up_);
            target3.drawBlack(g2, diameter);
            diameter2 -= 10;
            Target target4 = new Target(200+up_2,100+up_2);
            target4.drawWhite(g2, diameter2);
            diameter2 -= 10;
            up_ += 10;
            up_2 += 10;
        }
    }

}

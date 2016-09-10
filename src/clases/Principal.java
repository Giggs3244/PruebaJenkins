package clases;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author giggs_000
 */
public class Principal extends JFrame {

    public static void main(String a[]) {
        Casa casa = new Casa();
    }

}

class Casa extends JFrame {
    
    public Casa(){        
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        triangle = new Polygon(new int[]{50, 200, 350}, new int[]{200, 50, 200}, 3);
        square = new Polygon(new int[]{50, 50, 350, 350}, new int[]{400, 200, 200, 400}, 4);
    }
    
    private Polygon triangle;
    private Polygon square;
    
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillPolygon(triangle);
        g.setColor(Color.lightGray);
        g.fillPolygon(square);
    }
}

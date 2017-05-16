import java.awt.*;
import java.awt.image.BufferStrategy;

/**
 * Created by mhall17162 on 5/12/2017.
 */


public class GraphicsTest {
    public static void main(String args[]) {
        Display test = new Display("Test", 1200, 800);
        BufferStrategy bs;
        Graphics g;
        test.getCanvas().createBufferStrategy(3);
        bs = test.getCanvas().getBufferStrategy();
        g = bs.getDrawGraphics();
        g.drawRect(0,0,100,100);
        g.dispose();
    }
}

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Board extends JFrame {

    private BufferedImage image;

    public Board() {
        JFrame f = new JFrame("Mike did nothing");
        f.setVisible(true);
        f.setSize(1200, 800);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        Canvas c = new Canvas();
        c.setPreferredSize(new Dimension(1200, 800));
        c.setMaximumSize(new Dimension(1200, 800));
        c.setMinimumSize(new Dimension(1200, 800));
        c.setFocusable(false);
        f.add(c);
        f.pack();

        c.createBufferStrategy(3);
        Graphics g = c.getGraphics();
        c.setBackground(Color.BLACK);
        for(int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                image = ImageLoader.loadImage("/images/TRUMP1donebetter.png");
            }else {
                image = ImageLoader.loadImage("/images/Trump-Front.png");
            }
            g.drawImage(image, i, i, null);
            g.drawString(image.toString(), 0, 100);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Board b = new Board();
    }
}

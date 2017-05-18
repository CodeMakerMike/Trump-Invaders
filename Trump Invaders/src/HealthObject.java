import java.awt.Image;

public class HealthObject extends Sprite{
    private int health;
    private boolean isAlive;

    public HealthObject(Image image){
        super(image);
        health = 100;
        isAlive = true;
    }
}

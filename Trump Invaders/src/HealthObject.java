import java.awt.Image;

public class HealthObject extends Sprite{
    private int health;
    private boolean isAlive = true;

    public HealthObject(Image image){
        super(image);
        health = 100;
    }
    public HealthObject(Image image, int health){
        super(image);
        this.health = health;
    }
}

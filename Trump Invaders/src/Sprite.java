/**
 * Created by mhall17162 on 5/10/2017.
 */
    import java.awt.Image;
    import java.awt.Rectangle;

    public class Sprite {

        private boolean visible;
        private Image image;
        private int health;
        protected int x;
        protected int y;
        protected int width;
        protected int height;
        protected int dx;

        public Sprite(Image image) {
            this.image = image;
            visible = true;
            width = this.image.getWidth(null);
            height = this.image.getHeight(null);
        }

        public Rectangle getBounds(){
            return new Rectangle(x, y, width, height);
        }

        public void die() {

            visible = false;
        }

        public void setX(int x) {

            this.x = x;
        }

        public void setY(int y) {

            this.y = y;
        }

        public int getY() {

            return y;
        }

        public int getX() {

            return x;
        }

        public void setHealth(int health) {
            this.health = health;
        }
        
        public int getHealth(){
            return health;
        }

        public boolean isVisible() {

            return visible;
        }

        protected void setVisible(boolean visible) {

            this.visible = visible;
        }

        public void setImage(Image image) {

            this.image = image;
        }

        public Image getImage() {

            return image;
        }

    }
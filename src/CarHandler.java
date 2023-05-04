import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CarHandler implements KeyListener {
    GameGUI g ;
    CarHandler(GameGUI ref)
    {
        this.g = ref;
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if(code == 37)
        {
            int x = g.carPanel.getX();
            int y = g.carPanel.getY();
            if(x-g.speed > 0) {
                g.carPanel.setLocation(x - g.speed, y);
                //move left
            }
        }
        else if(code == 39)
        {
            //move right
            int x = g.carPanel.getX();
            int y = g.carPanel.getY();
            int width = g.frame.getWidth();
            int carWidth = g.carPanel.getWidth();
            if(x+g.speed + carWidth <=  width) {
                g.carPanel.setLocation(x + g.speed, y);
                //move left
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

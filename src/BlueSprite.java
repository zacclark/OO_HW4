import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class BlueSprite extends Sprite {
	
  public BlueSprite(int x, int y) {
    super(x, y);
    images = new LinkedList<Icon>();
    images.add(new ImageIcon("images/BlueNorth.png"));
    images.add(new ImageIcon("images/BlueSouth.png"));
    images.add(new ImageIcon("images/BlueEast.png"));
    images.add(new ImageIcon("images/BlueWest.png"));
    setDirection(Sprite.Direction.NORTH);
    currentVisualDirection = Sprite.Direction.NORTH;
    defaultMoveBehavior = new NorthSouthMove();
    setMoveBehavior(defaultMoveBehavior); 
  }

  public void animate(Canvas c) {
    switch (getDirection()) {
      case NONE:
        break;
      case NORTH:
        current = 0;
        break;
      case SOUTH:
        current = 1;
        break;
      case EAST:
        current = 2;
        break;
      case WEST:
        current = 3;
        break;
    }
  }

}

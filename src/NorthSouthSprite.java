import java.util.LinkedList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class NorthSouthSprite extends Sprite {

  public NorthSouthSprite(int x, int y) {
    super(x, y);
    images = new LinkedList<Icon>();
    images.add(new ImageIcon("images/north.png"));
    images.add(new ImageIcon("images/south.png"));
    setDirection(Sprite.Direction.NORTH);
    currentVisualDirection = Sprite.Direction.NORTH;
    defaultMoveBehavior = new NorthSouthMove();
    setMoveBehavior(defaultMoveBehavior); 
  }

  public void animate(Canvas c) {
     switch (getDirection()) {
      case NORTH:
        current = 0;
        currentVisualDirection = Sprite.Direction.NORTH;
        break;
      case SOUTH:
        current = 1;
        currentVisualDirection = Sprite.Direction.SOUTH;
        break;
    }
  }

}

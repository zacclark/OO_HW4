import java.util.LinkedList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class EastWestSprite extends Sprite {

  public EastWestSprite(int x, int y) {
    super(x, y);
    images = new LinkedList<Icon>();
    images.add(new ImageIcon("images/east.png"));
    images.add(new ImageIcon("images/west.png"));
    super.setDirection(Sprite.Direction.EAST);
    currentVisualDirection = Sprite.Direction.EAST;
    defaultMoveBehavior = new EastWestMove();
    setMoveBehavior(defaultMoveBehavior);
  }

  public void animate(Canvas c) {
    switch (getDirection()) {
      case EAST:
        current = 0;
        currentVisualDirection = Sprite.Direction.EAST;
        break;
      case WEST:
        current = 1;
        currentVisualDirection = Sprite.Direction.WEST;
        break;
    }
  }

}

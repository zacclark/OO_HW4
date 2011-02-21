import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class BlueSprite extends Sprite implements KeyListener {
	
  public BlueSprite(int x, int y) {
    super(x, y);
    images = new LinkedList<Icon>();
    images.add(new ImageIcon("images/BlueNorth.png"));
    images.add(new ImageIcon("images/BlueSouth.png"));
    images.add(new ImageIcon("images/BlueEast.png"));
    images.add(new ImageIcon("images/BlueWest.png"));
    setDirection(Sprite.Direction.NONE);
    defaultMoveBehavior = new ControllableMove();
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

  public void keyTyped(KeyEvent e) {
  }

  public void keyReleased(KeyEvent e) {
    if (e.getKeyCode() != e.VK_TAB) {
      setDirection(Sprite.Direction.NONE);
    }
  }

  public void keyPressed(KeyEvent e) {
    if (e.getKeyCode() == e.VK_UP) {
      setDirection(Sprite.Direction.NORTH);
    }
    if (e.getKeyCode() == e.VK_DOWN) {
      setDirection(Sprite.Direction.SOUTH);
    }
    if (e.getKeyCode() == e.VK_RIGHT) {
      setDirection(Sprite.Direction.EAST);
    }
    if (e.getKeyCode() == e.VK_LEFT) {
      setDirection(Sprite.Direction.WEST);
    }
  }

}

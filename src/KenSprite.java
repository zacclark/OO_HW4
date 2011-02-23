import java.util.LinkedList;

import javax.swing.Icon;
import javax.swing.ImageIcon;


public class KenSprite extends Sprite {

  public KenSprite(int x, int y) {
	    super(x, y);
	    images = new LinkedList<Icon>();
	    images.add(new ImageIcon("images/kenSpriteNorth.png"));
	    images.add(new ImageIcon("images/kenSpriteSouth.png"));
	    images.add(new ImageIcon("images/kenSpriteEast.png"));
	    images.add(new ImageIcon("images/kenSpriteWest.png"));
	    super.setDirection(Sprite.Direction.NORTH);
	    super.setLastAutoDirection(Sprite.Direction.NORTH);
	    defaultMoveBehavior = new RandMove();
	    setMoveBehavior(defaultMoveBehavior); 
	  }
	
	@Override
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

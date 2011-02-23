import java.util.LinkedList;

import javax.swing.Icon;
import javax.swing.ImageIcon;


public class KenSprite extends Sprite {

  public KenSprite(int x, int y) {
	    super(x, y);
	    images = new LinkedList<Icon>();
	    images.add(new ImageIcon("images/kenSpriteNorth.png"));
	    images.add(new ImageIcon("images/kenSpriteEast.png"));
	    images.add(new ImageIcon("images/kenSpriteSouth.png"));
	    images.add(new ImageIcon("images/kenSpriteWest.png"));
	    super.setDirection(Sprite.Direction.NORTH);
	    super.setLastAutoDirection(Sprite.Direction.NORTH);
	    defaultMoveBehavior = new KenMove();
	    setMoveBehavior(defaultMoveBehavior); 
	  }
  
  	// Set up a timeout so we can spin slowly, rather than change direction once per animate
  	private int spinTimeout = 8;
	
  	// Instead of changing the image depending on the direction of travel, the KenSprite just spins.
	@Override
	public void animate(Canvas c) {
		if (spinTimeout <= 0) {
			spinTimeout = 8;
			if (current == 3) {
				current = 0;
			}else{
				current++;
			}
		}else{
			spinTimeout -= 1;
		}
	}

}

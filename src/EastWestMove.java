import javax.swing.Icon;


public class EastWestMove implements MoveBehavior {

	@Override
	public void move(Canvas c, Sprite s) {
		if (s.getDirection() == Sprite.Direction.NORTH || s.getDirection() == Sprite.Direction.SOUTH
				|| s.getDirection() == Sprite.Direction.NONE) {
			s.setDirection(s.currentVisualDirection);
		}
		switch (s.getDirection()) {
	      case EAST:
	        s.setX(s.getX() + 10);
	        Icon icon = s.getCurrentImage();
	        if (s.getX() + icon.getIconWidth() > c.getSize().getWidth()) {
	          s.setX((int)(c.getSize().getWidth() - icon.getIconWidth()));
	          s.setDirection(Sprite.Direction.WEST);
	        }
	        break;
	      case WEST:
	        s.setX(s.getX() - 10);
	        if (s.getX() < 0) {
	          s.setX(0);
	          s.setDirection(Sprite.Direction.EAST);
	        }
	        break;
	    }
	}

}

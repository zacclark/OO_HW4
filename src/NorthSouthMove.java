import javax.swing.Icon;


public class NorthSouthMove implements MoveBehavior {

	@Override
	public void move(Canvas c, Sprite s) {
		if (s.getDirection() == Sprite.Direction.EAST || s.getDirection() == Sprite.Direction.WEST 
				|| s.getDirection() == Sprite.Direction.NONE) {
			s.setDirection(s.getLastAutoDirection());
		}
		switch (s.getDirection()) {
	      case NORTH:
	        s.setY(s.getY() - 10);
	        if (s.getY() < 0) {
	        	s.setY(0);
	        	s.setDirection(Sprite.Direction.SOUTH);
	        }
	        break;
	      case SOUTH:
	    	s.setY(s.getY() + 10);
	        Icon icon = s.getCurrentImage();
	        if (s.getY() + icon.getIconHeight() > c.getSize().getHeight()) {
	          s.setY((int)(c.getSize().getHeight() - icon.getIconHeight()));
	          s.setDirection(Sprite.Direction.NORTH);
	        }
	        break;
	    }
	}
	
}

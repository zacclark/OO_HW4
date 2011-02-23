import javax.swing.Icon;


public class RandMove implements MoveBehavior {
	
	private int toMoveDistance = 0;
	
	private int randinrange(int min, int max) {
		return min + (int)(Math.random() * ((max - min) + 1));
	}

	@Override
	public void move(Canvas c, Sprite s) {
		if (s.getDirection() == Sprite.Direction.NONE) {
			s.setDirection(s.getLastAutoDirection());
		}
		
		Icon icon = s.getCurrentImage();

		int  iconHeight   = icon.getIconHeight();
		int  iconWidth    = icon.getIconWidth();
		int  canvasHeight = (int)c.getSize().getHeight();
		int  canvasWidth  = (int)c.getSize().getWidth();
		
		if (toMoveDistance <= 0) {
			toMoveDistance = randinrange(50, 300);
			
			switch(randinrange(0, 3)) {
			case 0:
				s.setDirection(Sprite.Direction.NORTH);
				break;
			case 1:
				s.setDirection(Sprite.Direction.EAST);
				break;
			case 2:
				s.setDirection(Sprite.Direction.SOUTH);
				break;
			case 3:
				s.setDirection(Sprite.Direction.WEST);
				break;
			}
		}
		
		int speed = 30;

		switch (s.getDirection()) {
		  case NORTH:
		    s.setY(s.getY() - speed);
		    toMoveDistance -= speed;
		    if (s.getY() < 0) {
		      s.setY(0);
		      toMoveDistance = 0;
		    }
		    break;
		  case SOUTH:
		    s.setY(s.getY() + speed);
		    toMoveDistance -= speed;
		    if (s.getY() + iconHeight > canvasHeight) {
		      s.setY((int)(canvasHeight - iconHeight));
		      toMoveDistance = 0;
		    }
		    break;
		  case EAST:
		    s.setX(s.getX() + speed);
		    toMoveDistance -= speed;
		    if (s.getX() + iconWidth > canvasWidth) {
		      s.setX((int)(canvasWidth - iconWidth));
		      toMoveDistance = 0;
		    }
		    break;
		  case WEST:
		    s.setX(s.getX() - speed);
		    toMoveDistance -= speed;
		    if (s.getX() < 0) {
		      s.setX(0);
		      toMoveDistance = 0;
		    }
		    break;
		}
	}

}

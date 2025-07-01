
public class DropEnemy extends Enemy{
	
	private double ay;

	public DropEnemy(double x, double y, double vx, double vy) {
		
		super(x, y, vx, vy);
		ay = 0.1 * GameWorld.stage;
		life = 1;
		score = 10;
	}

	public void move() {
		
		super.move();
		
		vy = vy + 0.1;
		
		int leftLimit = 0;
		int rightLimit = 370;
		
		if (x < leftLimit) x = leftLimit;
		if (x > rightLimit) x = rightLimit;
		
	}
	
	public void draw (MyFrame f) {
		
		f.setColor(205, 92, 92);
		f.fillRect(x, y, 30, 10);
		f.setColor(205, 92, 92);
		f.fillRect(x+10, y+10, 10, 20);
		
	}
}

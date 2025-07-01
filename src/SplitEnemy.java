
public class SplitEnemy extends Enemy{

	public SplitEnemy(double x, double y, double vx, double vy) {
		
		super(x, y, vx, vy);
		life = 5 + GameWorld.stage;
		score = 15;
		
	}
	
	public void move() {
		
		super.move();
		y += vy;
		
		int leftLimit = 0;
		int rightLimit = 370;
		
		if(x < leftLimit) x = 0;
		if(x > rightLimit) x = 370;
		
	}
	
	public void draw (MyFrame f) {
		
		f.setColor(220, 20, 60);
		f.fillOval(x, y, 30, 30);
		
	}

}


public class RandomEnemy extends Enemy{

	public RandomEnemy(double x, double y, double vx, double vy) {
		
		super(x, y, vx, vy);
		life = 2 + GameWorld.stage;
		score = 5;
	}
	
	public void move() {
		
		super.move();
		
		vx = (Math.random() - 0.5) * 2 * GameWorld.stage;
		
	}
	
	public void draw (MyFrame f) {
		
		f.setColor(64, 224, 208);
		f.fillRect(x, y, 10, 20);
		f.setColor(64, 224, 208);
		f.fillRect(x+10, y+20, 10, 10);
		f.setColor(64, 64, 208);
		f.fillRect(x+20, y, 10, 20);
		
	}

}

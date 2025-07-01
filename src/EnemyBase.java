
public class EnemyBase extends Enemy{

	public EnemyBase(double x, double y, double vx, double vy) {
		
		super(x, y, vx, vy);
		life = 20;
		score = 10;
	}
	
	public void move() {
		
		super.move();
		
		int leftLimit = 0;
		int rightLimit = 370;
		
		
		if (x > rightLimit) vx = -Math.abs(GameWorld.stage);
		if (x < leftLimit) vx = Math.abs(GameWorld.stage);
		
		if (Math.random() < 0.01) {
			
			GameWorld.enemies.add(new StraightEnemy(x, y, 0, 1+GameWorld.stage));
			
		}
		
		if (Math.random() < 0.05) {
			
			GameWorld.enemies.add(new RandomEnemy(x, y, 0, GameWorld.stage));
			
		}
		
		if (Math.random() < 0.02) {
			
			GameWorld.enemies.add(new DropEnemy(x, y, 0, GameWorld.stage));
			
		}
		
		if (Math.random() < 0.01) {
			
			GameWorld.enemies.add(new CurveEnemy(x, y, 0, GameWorld.stage));
			
		}
		
		if (Math.random() < 0.01) {
			
			GameWorld.enemies.add(new SplitEnemy(x, y, 0, 1+GameWorld.stage * 0.3));
			
		}
	}
	
	public void draw (MyFrame f) {
		
		f.setColor(75, 0, 130);
		f.fillOval(x, y, 32, 32);
		f.setColor(127, 255, 212);
		f.fillOval(x-16, y+8, 64, 16);
			
	}

}


public class DropEnemy extends Enemy{
	public DropEnemy(double x, double y,double vx, double vy) {
		public void move() {
			super.move();
			vy=vy+0.1;
		}
	}
}

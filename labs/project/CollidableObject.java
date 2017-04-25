package project;

public interface CollidableObject {

	public void redraw();
	/**
	 * Take in x-coordinate and y-coordinate of projectile and determine if it has collided with the object or not
	 * @param x x-coordinate of projectile
	 * @param y y-coordinate of projectile
	 * @return True for collision, false for no collision
	 */
	public boolean checkCollision(double x, double y);

}
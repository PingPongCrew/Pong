package de.pingpongcrew.logic;

public abstract class MovingObject implements MovingObjectI {


	private double x,y,width,height,velx, vely;
	
	
	public MovingObject(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.velx = 0;
		this.vely = 0;
	}

	
	/* (non-Javadoc)
	 * @see de.pingpongcrew.logic.MovingObjectI#setX(double)
	 */
	@Override
	public void setX(double x) {
		this.x = x;
	}


	/* (non-Javadoc)
	 * @see de.pingpongcrew.logic.MovingObjectI#setY(double)
	 */
	@Override
	public void setY(double y) {
		this.y = y;
	}


	/* (non-Javadoc)
	 * @see de.pingpongcrew.logic.MovingObjectI#setWidth(double)
	 */
	@Override
	public void setWidth(double width) {
		this.width = width;
	}


	/* (non-Javadoc)
	 * @see de.pingpongcrew.logic.MovingObjectI#setHeight(double)
	 */
	@Override
	public void setHeight(double height) {
		this.height = height;
	}
	
	/* (non-Javadoc)
	 * @see de.pingpongcrew.logic.MovingObjectI#update()
	 */
	@Override
	public void update() {
		this.x += this.velx;
		this.y += this.vely;
	}
	
	
}

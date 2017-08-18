package controller;

public class Point {
	private int Y;
	private int X;
	
	public Point(int x, int y){
		this.X = x;
		this.Y = y;
	}

	public int getX() {
		return this.X;
	}

	public int getY(){
		return this.Y;
	}

	public void setX(int x) {
		this.X = x;
	}
	
	public void setY(int y){
		this.Y = y;
	}
}


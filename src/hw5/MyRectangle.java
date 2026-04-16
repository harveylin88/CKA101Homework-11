package hw5;

public class MyRectangle {
	private double width;
	private double depth;
	void setWidth(double width) {
		this.width=width;
	}
	public double getWidth() {
		return width;
	}
	void setDepth(double depth) {
		this.depth=depth;
	}
	public double getDepth() {
		return depth;
	}
	
	public double getArea() {
		return width*depth;
		
	}
	public MyRectangle() {
		
	}
	public MyRectangle(double width,double depth) {
		setWidth(width);
		setDepth(depth);
	}
}

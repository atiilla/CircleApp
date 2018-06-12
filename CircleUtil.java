package geometry;

public class CircleUtil {

	private int radius;
	public static final int ANGLES = 0;
	private static int count = 0;
	private int x;
	private int y;

	{
		count++;
	}

	public CircleUtil() {
		this(0, 0, 0);
	}

	public CircleUtil(int radius) {
		this(radius, 0, 0);
	}

	public CircleUtil(int radius, int x, int y) {
		super();
		setRadius(radius);
	}

	public CircleUtil(CircleUtil circ) {
		this(circ.radius, circ.getX(), circ.getY());
	}

	public void setRadius(int radius) {
		this.radius = (radius < 0) ? -radius : radius;
	}

	public int getRadius() {
		return radius;
	}

	public void grow(int dr) {
		radius += dr;
		if (radius < 0)
			radius = 0;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double getArea() {
		return Math.PI * radius * (double) radius;
	}

	public double getPerimeter() {
		return 2 * Math.PI * (double) radius;
	}

	public static int getCount() {
		return count;
	}

	public void scale(int factor) {
		double f = Math.sqrt(factor) / 10;
		radius = (int) (radius * f);
	}

	public String toString() {
		return String.format("Circle [radius=%s, x=%s, y=%s]", radius, getX(), getY());
	}

}

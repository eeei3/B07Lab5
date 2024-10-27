package lab4;

public class Pentagon {
	//vertices of the pentagon
	Point a;
	Point b;
	Point c;
	Point d;
	Point e;
	
	
	public Pentagon(Point a, Point b, Point c, Point d, Point e) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
	}
	
	public double perimeter() {
		return (a.distance(b) + b.distance(c) + c.distance(d) + d.distance(e) + e.distance(a));
	}
	
	public boolean isEquilateral() {
		double AB = a.distance(b);
		double BC = b.distance(c);
		double CD = c.distance(d);
		double DE = d.distance(e);
		double EA = e.distance(a);
		
		return (AB == BC) && (BC == CD) && (CD == DE) && (DE == EA);
	}
}

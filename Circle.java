public class Circle {

	Point A;
	double r;
	
	public Circle (Point A, double r) {
		
		this.A = A;
		this.r = r;
		
	}
	
	public double circumference() {
		return 2*Math.PI*r;
	}
		
	public double diameter() {
		return 2*r;
	}

	public double area() {
		return Math.PI*r*r;
	}
	
	@Override 
	public boolean equals(Object obj) {
		
		if (!(obj instanceof Circle)) {
			return false
		}
		Circle other = (Circle) obj;
		return r == other.r;
	}
	
}

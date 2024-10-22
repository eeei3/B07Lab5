import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HexagonTest {

	@Test
	void testHexagonPerimeter() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(9,0);
		Point p3 = new Point(11,0);
		Point p4 = new Point(11,11);
		Point p5 = new Point(0,11);
		Point p6 = new Point(0,3);
		Hexagon H = new Hexagon(p1,p2,p3,p4,p5,p6);
		assertEquals(H.perimeter(),44);
	}
	
	@Test
	void testHexagonIsRegular() {
		Point A = new Point(0,0);
		Point B = new Point(2,0);
	    Point C = new Point(2,2);
	    Point D = new Point(0,2);
	    Point E = new Point(0,0);
	    Point F = new Point(2,0);
		Hexagon H = new Hexagon(A,B,C,D,E,F);
		assertTrue(H.isRegular());
	}
	
	@Test
	void testHexagonNotRegular() {
		Point A = new Point(1, 0);
		Point B = new Point(0.5, Math.sqrt(3)/2);
	    Point C = new Point(-0.5, Math.sqrt(3)/2);
	    Point D = new Point(-1, 0);
	    Point E = new Point(-0.5, -Math.sqrt(3)/2);
	    Point F = new Point(0.5, -Math.sqrt(3)/2);
		Hexagon H = new Hexagon(A,B,C,D,E,F);
		assertFalse(H.isRegular());
	}
}
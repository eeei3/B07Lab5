import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTests {

	@Test
	void testcircumference() {
		Circle c = new Circle(new Point(0,0), 1);
		double expected = 2*Math.PI*1;
		assertEquals(c.circumference(), expected);
	}
	
	@Test
    public void testDiameter() {
		Circle c = new Circle(new Point(0,0), 1);
		double expected = 2;
        assertEquals(2, c.diameter());
    }

    @Test
    public void testArea() {
    	Circle c = new Circle(new Point(0, 0), 5);
        double expected = Math.PI * 25;
        assertEquals(expected, c.area());
    }

    @Test
    public void testEquals() {	
	Circle c = new Circle(new Point(1, 1), 5);
        Circle sameCircle = new Circle(new Point(0, 0), 5);
        assertTrue(c.equals(sameCircle));
    }
}

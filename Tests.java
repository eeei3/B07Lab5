import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tests {
	
	//Initializing of Points
		@Test
		void samePoints() {
			Point p1 = new Point(2,3);
			Point p2 = new Point(2,3);
			assertTrue(p1.equals(p2));
		}
		
		@Test
	    void notSame() {
	        Point p1 = new Point(1, 2);
	        Point p2 = new Point(3, 4);
	        assertFalse(p1.equals(p2));
	    }
		
		//Distance
		@Test
	    void distanceItself() {
	        Point p1 = new Point(1, 1);
	        assertEquals(0.0,p1.distance(p1));
	    }
		
		@Test
	    void distanceBetweenTwoPoints() {
	        Point p1 = new Point(2, 2);
	        Point p2 = new Point(2, 4);
	        assertEquals(2.0, p2.distance(p1));
	    }
		
		@Test
	    void hashcodecheck() {
	        Point p1 = new Point(4, 2);
	        assertEquals(22, p1.hashCode());
	    }
		
		@Test
	    void isObj() {
	        Point p1 = new Point(4, 2);
	        assertTrue(p1.equals(p1));
	    }
		
		@Test
	    void isObjNull() {
	        Point p1 = new Point(4, 2);
	        assertFalse(p1.equals(null));
	    }
		
		
	    @Test
	    void testDiffClass() {
	        Point p1 = new Point(1.0, 2.0);
	        String name = "nope";
	        assertFalse(p1.equals(name)); 
	    }
		
		@Test
	    void isObjClassX() {
	        Point p1 = new Point(0, 2);
	        Point p2 = new Point(9, 2);
	        assertFalse(p1.equals(p2));
	    }
		
		// Test inequality when one coordinate is decimal and the other is not
	    @Test
	    void testDecimalVsIntegerCoordinates() {
	        Point p1 = new Point(1.0, 2.0);
	        Point p2 = new Point(1.0, 2.5);
	        assertFalse(p1.equals(p2)); // Should not be equal
	    }
		
		@Test
	    void isObjY() {
			Point p1 = new Point(1, 2);
	        Point p2 = new Point(1, 3);
	        assertFalse(p1.equals(p2));
	    }
		
		//Triangle
		@Test
	    void TriPeri() {
			Point a = new Point(1,1);
			Point b = new Point(1,2);
			Point c = new Point(1,1);
			Triangle t = new Triangle(a,b,c);
			assertEquals(2.0, t.perimeter());
	    }
		
		@Test
	    void TriFalse() {
			Point a = new Point(1,1);
			Point b = new Point(1,2);
			Point c = new Point(1,1);
			Triangle t = new Triangle(a,b,c);
			assertFalse(t.isEquilateral());
	    }
		
			@Test
		    void TriTrue() {
				Point a = new Point(0,0);
				Point b = new Point(Math.sqrt(5), 0);
				Point c = new Point(Math.sqrt(5)/2, Math.sqrt(15)/2);
				Triangle t = new Triangle(a,b,c);
				assertTrue(t.isEquilateral());
		    }
			
		@Test
		void PentagonEquilateral() {
			Point a = new Point(1,1);
			Point b = new Point(1,1);
			Point c = new Point(1,1);
			Point d = new Point(1,1);
			Point e = new Point(1,1);
			
			Pentagon p = new Pentagon(a,b,c,d,e);
			assertTrue(p.isEquilateral());
		}
		
		void PentagonNotEquilateral() {
			Point a = new Point(1,2);
			Point b = new Point(1,5);
			Point c = new Point(1,9);
			Point d = new Point(1,10);
			Point e = new Point(1,12);
			
			Pentagon p = new Pentagon(a,b,c,d,e);
			assertFalse(p.isEquilateral());
		}
		
		@Test
		void PentagonPeriZero() {
			Point a = new Point(1,1);
			Point b = new Point(1,1);
			Point c = new Point(1,1);
			Point d = new Point(1,1);
			Point e = new Point(1,1);
			
			Pentagon p = new Pentagon(a,b,c,d,e);
			assertEquals(0, p.perimeter());
		}
		
		@Test
		void PentagonPeriNotZero() {
			Point a = new Point(1,1);
			Point b = new Point(1,2);
			Point c = new Point(1,3);
			Point d = new Point(1,4);
			Point e = new Point(1,5);
			
			Pentagon p = new Pentagon(a,b,c,d,e);
			assertEquals(8, p.perimeter());
		}
	
}

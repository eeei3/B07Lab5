package lab4;

public class Hexagon {
    Point A;
    Point B;
    Point C;
    Point D;
    Point E;
    Point F;
    public Hexagon(Point A, Point B, Point C, Point D, Point E, Point F) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        this.E = E;
        this.F = F;
    }

    public double perimeter() {return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(E) + E.distance(F) + F.distance(A);}

    public boolean isRegular() {
        double dAB = A.distance(B);
        double dBC = B.distance(C);
        double dCD = C.distance(D);
        double dDE = D.distance(E);
        double dEF = E.distance(F);
        double dFA = F.distance(A);
        if (dAB == dBC && dCD == dDE && dEF == dFA && dFA == dAB)
            return true;
        else
            return false;

    }
}

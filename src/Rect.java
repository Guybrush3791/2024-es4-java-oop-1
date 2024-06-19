public class Rect {

    int x;
    int y;

    public Rect(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getPer() {

        return (x + y) * 2;
    }

    public int getArea() {

        return x * y;
    }

    @Override
    public String toString() {

        return "Rect [x=" + x + ", y=" + y + "] | Area: " + getArea() + " | Perimeter: " + getPer();
    }
}

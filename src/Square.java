public class Square {

    int x;

    public Square(int x) {
        this.x = x;
    }

    public int getPer() {

        return x * 4;
    }

    public int getArea() {

        return x * x;
    }

    @Override
    public String toString() {

        return "Square [x=" + x + "] | Area: " + getArea() + " | Perimeter: " + getPer();
    }
}

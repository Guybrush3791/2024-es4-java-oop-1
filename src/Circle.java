public class Circle {

    // TODO
    // definire variabili che caratterizzano un cerchio
    int r;

    // definire un costruttore
    public Circle(int r) {

        this.r = r;
    }

    // definire metodo per calcolare il perimetro
    // e area
    public double getPer() {

        return 2 * 3.14 * r;
    }

    public double getArea() {

        return r * r * 3.14;
    }

    // definire toString per stampare i valori
    @Override
    public String toString() {

        return "Circle [r=" + r + "] | Area: " + getArea() + " | Perimeter: " + getPer();
    }
}

// FORMULA:
// Perimetro = 2 * 3.14 * raggio
// Area = 3.14 * raggio * raggio
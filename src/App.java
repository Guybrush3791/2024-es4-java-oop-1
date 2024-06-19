public class App {
    public static void main(String[] args) throws Exception {

        es1();
    }

    public static void es1() {

        Square s = new Square(10);
        s.x += 5;

        System.out.println(s);
        System.out.println("s x: " + s.x);
        System.out.println("s getPer: " + s.getPer());
        System.out.println("s getArea: " + s.getArea());

        System.out.println("--------------------");

        Square s2 = new Square(20);

        System.out.println(s2);
        System.out.println("s2 x: " + s2.x);
        System.out.println("s2 getPer: " + s2.getPer());
        System.out.println("s2 getArea: " + s2.getArea());

        System.out.println("--------------------");

        Rect r = new Rect(10, 20);

        System.out.println("r area: " + r.getArea());
    }
}

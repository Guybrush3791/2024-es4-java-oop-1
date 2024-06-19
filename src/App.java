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

        System.out.println("--------------------");

        Circle c1 = new Circle(1);
        Circle c2 = new Circle(2);

        System.out.println(c1);
        System.out.println("c1 r: " + c1.r);
        System.out.println("c1 getPer: " + c1.getPer());
        System.out.println("c1 getArea: " + c1.getArea());

        System.out.println("--------------------");

        System.out.println(c2);
        System.out.println("c2 r: " + c2.r);
        System.out.println("c2 getPer: " + c2.getPer());
        System.out.println("c2 getArea: " + c2.getArea());

        System.out.println("--------------------");

        Person p1 = new Person("Mario", 30);
        Person p2 = new Person("Luigi", 40);

        System.out.println(p1.getDetails());

        System.out.println(p1);
        System.out.println(p2);
    }
}

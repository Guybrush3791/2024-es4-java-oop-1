public class App {
    public static void main(String[] args) throws Exception {

        // esPerson();
        esAutomobili();
    }

    public static void esSquare() {

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

    }

    public static void esRect() {

        Rect r = new Rect(10, 20);

        System.out.println("r area: " + r.getArea());

    }

    public static void esCircle() {

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

    }

    public static void esPerson() {

        Person p1 = new Person("Mario", 30);
        Person p2 = new Person("Luigi", 40);

        System.out.println(p1.getDetails());
        System.out.println(p2.getDetails());

        // p1.name = "Tulio";

        p1.setName("Guybrush");
        p2.setAge(300);

        System.out.println(p1.getDetails());
        System.out.println(p2.getDetails());

        System.out.println(p1);
        System.out.println(p2);

    }

    public static void esStudent() {

        Studente st1 = new Studente("Guybrush", "Threepwood", -1);
        Studente st2 = new Studente("Elaine", "Marley", 9884);

        // st1.mat = -1;
        // st2.mat = -2;

        int st1mat = st1.getMat();
        System.out.println(st1mat);

        st1.setMat(-1);

        System.out.println(st1.getDetails());
        System.out.println(st2.getDetails());

        System.out.println(st1);
        System.out.println(st2);
    }

    public static void esAutomobili() {

        Automobile a1 = new Automobile("Fiat", "Panda", "AB123CD");
        Automobile a2 = new Automobile("Ford", "Focus", "EF456GH");

        System.out.println(a1.getMarca());
        System.out.println(a1.getModello());
        System.out.println(a1.getTarga());

        a1.setMarca("Ferrari");
        a1.setModello("Testarossa");
        a1.setTarga("XX000YY");

        System.out.println(a1.getDetails());
        System.out.println(a2.getDetails());

        System.out.println(a1);
        System.out.println(a2);
    }
}

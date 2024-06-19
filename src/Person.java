public class Person {

    /**
     * TODO:
     * 
     * modificare le variabili rendendole private
     * 
     * aggiungere proprieta' getter/setter per ogni
     * variabile
     * 
     * modificare il costruttore in modo che utilizzi
     * le proprieta' setter
     * 
     * modificare il metodo getDetails in modo che
     * utilizzi le proprieta' getter
     * 
     * testare adeguatamente il risultato finale
     * 
     */

    private String name;
    private int age;

    public Person(String name, int age) {

        setName(name);
        setAge(age);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getDetails() {

        return getName() + " - age: " + getAge();
    }

    @Override
    public String toString() {

        return "Person: " + getDetails();
    }
}

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
     */

    String name;
    int age;

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String getDetails() {

        return name + " - age: " + age;
    }

    @Override
    public String toString() {

        return "Person: " + getDetails();
    }
}

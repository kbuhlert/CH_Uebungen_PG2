package Comparatoren;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private int id;
    private String lastName;

    public Person(int id, String lastName) {
        this.id = id;
        this.lastName = lastName;
    }

    //Wenn Personen in String oder Collection gelegt werden, werden diese nach Attribut "id" sortiert
    //hierfür muss die compareTo()-Methode des comparable-Interfaces übschrieben werden
    @Override
    public int compareTo(Person o) {
        if(this.id < o.id)
            return-1;
        if(this.id > o.id)
            return 1;
        return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                '}';
    }
    //es sollten auch die equals- und hashcode Methode überschrieben werden (automatisch generiert)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastName);
    }
}

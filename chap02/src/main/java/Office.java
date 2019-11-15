import java.util.Arrays;

public class Office implements Cloneable {
  private Person[] persons;

  public Office(Person ...persons) {
    this.persons = Arrays.copyOf(persons, persons.length);
  }

  @Override
  public String toString() {
    return String.format("%s{persons=%s}", getClass().getSimpleName(), Arrays.toString(persons));
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    final Office clone = (Office) super.clone();
    clone.persons = persons.clone();
    return clone;
  }

  public Person[] getPersons() {
    return persons;
  }
}

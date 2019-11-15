public class Person implements Cloneable {

  private String firstName;
  private String lastName;
  private String email;

  public Person(final String firstName, final String lastName, final String email) {
    this.lastName = lastName;
    this.firstName = firstName;
    this.email = email;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return String.format("%s[email=%s, first name=%s, last name=%s]", getClass().getSimpleName(), email, firstName, lastName);
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return (Person) super.clone();
  }
}

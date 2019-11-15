public class Main {

  public static void main(String[] args) throws CloneNotSupportedException{
    final Person person = new Person("Jinseok", "Lee", "sonaky47@naver.com");
    System.out.println(person.toString());

    final Office office = new Office(person);
    System.out.println(office.toString());

    final Office clone = (Office) office.clone();
    System.out.println(clone.toString());

    final Person person2 = new Person("Jinseok", "Lee", "sonaky47@naver.com");
    System.out.println("person, person2 equality = " + person.equals(person2));
  }

}

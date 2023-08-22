package challenges.classDinner;

public class Dinner {
  public static void main(String[] args) {
    Person person = new Person("Jão", 60.5);
    Food bean = new Food("bean", 0.3);
    Food rice = new Food("rice", 0.5);
    Food meat = new Food("meat", 0.36);

    person.eat(bean);
    person.eat(rice);
    person.eat(meat);

    System.out.println("O peso inicial de " + person.name + " era " + person.initialWeight);
    System.out.println("O peso atual de " + person.name + " é " + person.actualWeight);

  }
}

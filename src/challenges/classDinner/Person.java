package challenges.classDinner;

public class Person {
  String name;
  double initialWeight;
  double actualWeight;

  Person(String name, double initialWeight) {
    this.name = name;
    this.initialWeight = initialWeight;
    this.actualWeight = initialWeight;
  }

  void eat(Food food) {
    this.actualWeight = actualWeight + food.weight;
  }
}

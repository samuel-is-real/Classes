public class Primates {
  // Attributes
  String name;
  String favFood;
  String species;
  String size;
  String colour;
  char sex;
  int age;
  double weight;
  
  // Constructor \\
public Primates(String name, String favFood, String species, String size, String colour, char sex, int age, double weight) {
  this.name = name;
  this.favFood = favFood;
  this.species = species;
  this.size = size;
  this.colour = colour;
  this.sex = sex;
  this.age = age;
  this.weight = weight;
}
  public void communicate() {
    System.out.println(this.name + " screams oo oo aa aa and hears a response in the distance.\n");
  }

  public void sleep(int hoursSlept) {
    System.out.println(this.name + " has slept for " + hoursSlept + " hours.\n");
  }

  public void climb(String object) {
    System.out.println(this.name + " decides to climb on top of a " + object + ".\n");
  }
}

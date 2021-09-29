public class Main {
  public static void main(String[] args) {

    Primates monkey1 = new Primates("Evan", "Banana", "African Monkey", "Small", "Brown", 'M', 5, 50.5);
    
    System.out.println("Name: " + monkey1.name);
    System.out.println("Favorite food: " + monkey1.favFood);
    System.out.println("Species: " + monkey1.species);
    System.out.println("Size: " + monkey1.size);
    System.out.println("Colour: " + monkey1.colour);
    System.out.println("Sex: " + monkey1.sex);
    System.out.println("Age: " + monkey1.age);
    System.out.println("Weight: " + monkey1.weight + "kg\n");   

    monkey1.sleep(3);
    monkey1.climb("tree");
    monkey1.communicate();
  }
}
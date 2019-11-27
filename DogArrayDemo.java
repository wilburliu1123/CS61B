public class DogArrayDemo {
  public static void main(String[] args) {
    /* Create an array of two dogs. */
    // Dog[] dogs = new Dog[2];
    // dogs[0] = new Dog(8);
    // dogs[1] = new Dog(100);
    // dogs[1].makeNoise();
    Dog d = new Dog(15);
    Dog d2 = new Dog(100);
    d.maxDog(d2);
System.out.println(d2);
  }
}

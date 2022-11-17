
class overloadA {

  void area(int a) {
    System.out.println("The area of square is " + a * a + " sq units");
  }

  void area(float a, float b) {
    System.out.println("The area of rectangle is " + a * b + " sq units");
  }

  void area(double a) {
    System.out.println("The area of circle is " + 3.14 * a * a + " sq units");
  }

}

public class overload {
  public static void main(String args[])

  {
    overloadA ob = new overloadA();
    ob.area(5);
    ob.area(4, 10);
    ob.area(2.25);
  }
}

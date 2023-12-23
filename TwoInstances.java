public class TwoInstances {
  int x = 53;

  public static void main(String[] args) {
    TwoInstances myObj1 = new TwoInstances();
    TwoInstances myObj2 = new TwoInstances();
    myObj1.x = 20;
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
  }
}

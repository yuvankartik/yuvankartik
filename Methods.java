public class Methods {
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

 
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  
  public static void main(String[] args) {
    myStaticMethod(); 

    Methods myObj = new Methods(); 
    myObj.myPublicMethod(); 
  }
}

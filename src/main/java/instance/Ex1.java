package instance;

public class Ex1 {
  private int x = 100;

  // this syntax "explicit this" MUST have this as first argument,
  // and MUST have type of enclosing class
  // allows annotation of the param
//  public /*static*/ void showX(Ex1 this) {
//    System.out.println("Value of self.x is " + this.x);
//  }
  public static void showX(Ex1 self) {
    System.out.println("Value of self.x is " + self.x);
  }

  public static void main(String[] args) {
//    System.out.println(this.x);
    Ex1 self = new Ex1();
    System.out.println(self.x);
    Ex1.showX(self);
//    self.showX();
  }
}

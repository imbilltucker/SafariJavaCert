package liskov;

class Base {
  protected int x;
  void doBaseStuff() {
    System.out.println("doBaseStuff");
  }
}

class Sub extends Base {
  // protected means "accessible in the same package (as default)
  // AND from subclasses in other packages, IF & ONLY IF the
  // reference is of the SUBCLASS type
  void doBaseStuff() {
    System.out.println("doSubStuff");
  }
  void doOtherStuff() {
    System.out.println("doOtherStuff");
  }
//
//  static void lookAgain(Base b) {
//    b.x = 100; // does not work in another package...
//  }

  void lookAtX(Sub this) {
    this.x = 100;
  }
}

public class Access {
}

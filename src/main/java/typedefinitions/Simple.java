package typedefinitions;

interface MyInterface {
  // only "variables" in an interface must be
  // public static final constants in an interface
  /*private */int MAX = 100;
}
// top-level class can be public, or "default"
// default means anywhere in the same package

// abstract cannot be final
/*final */abstract class Animal {
  // abstract class:
  // cannot be directly instantiated.
  // must be subclassed to be used
  // must have (to be useful) a non-private constructor
  // Animal() {} // ALLOWED???!!!
  Animal() {
    super(); // goes to Object
    System.out.println("intializing Animal");
  }
  // can have concrete methods, fields
  // can have abstract methods...
//  abstract void doStuff();

}

class Lion extends Animal {
  {
    System.out.println("before x is initialized...");
//    System.out.println("Value of x is " + x);
  }
  private int x;
  {
    System.out.println("Value of x is " + x);
    x = 100;
    System.out.println("Value of x is " + x);
  }
  // if you do not code ANY constructor, the compiler gives you one...
  // "default" constructor:
  // zero args, same access as the class (except for Enums which
  // are ALWAYS private constructors)
  // has "empty" body
  Lion() {
    // cannot do this! super() or this() MUST COME FIRST
//    System.out.println("before delegating to Animal constructor ");
    super(); // or this(xx);; delegate to an overloaded constructor in this class
    // IMPLICIT instance initialization
    // i.e. all the private int x = some-expression;
    System.out.println("initializing Lion");
  }
}

public class Simple {
  // can define static / instance fields/methods/types!
  // regular class must not have abstract methods (directly or indirectly)
  public static void main(String[] args) {
    new Lion();
  }
}

package typedefinitions;

interface One {
//  default void doStuff() {}
}

interface Two extends One {
  default void doStuff() {}
}

interface Three extends One {
  default void doStuff() {}
}

class Parent {

}

public class DefaultResolution implements Two, Three {

  @Override
  public void doStuff() {
    Three.super.doStuff();
    Two.super.doStuff();
  }
}

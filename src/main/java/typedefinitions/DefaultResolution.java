package typedefinitions;

interface One {
//  private int x;
  default void doStuff() {}
}

interface Two extends One {
//  storage called x??
  default void doStuff() {}
}

interface Three extends One {
//  storage called x??
  default void doStuff() {}
}

class Parent {
  // private exposes weird bug in Java, compiles, but does not run :(
   /*private */public void doStuff() {}
}

public class DefaultResolution extends Parent implements Two, Three {
//  @Override
//  public void doStuff() {
//    Three.super.doStuff();
//    Two.super.doStuff();
//  }
  public static void main(String[] args) {
    DefaultResolution d = new DefaultResolution();
    d.doStuff();
  }
}

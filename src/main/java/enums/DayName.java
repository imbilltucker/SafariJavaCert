package enums;

import java.lang.reflect.Constructor;
import java.util.Locale;

// enums are unavoidably final, cannot add the keyword
public enum DayName {
  MONDAY(99), TUESDAY(100), WEDNESDAY(101), THURSDAY, FRIDAY, SATURDAY, SUNDAY;
  private int x;
  public static float y;

  private DayName() {}
  /*private*/ DayName(int x) {
    System.out.println("Instantiating with x = " + x);
    this.x = x;
  }

  public static void doStuff() {}
  // nope, name() is final
//  public String name() { return null; }
  public String toString() { return super.toString().toLowerCase(); }
  public void sayHello() {
    System.out.println(this.name());
    System.out.println(this.toString());
  }

  public static void main(String[] args) {
    DayName.TUESDAY.sayHello();
    Class<?> clazz = DayName.class;
    Constructor[] constructors = clazz.getDeclaredConstructors();
    for (Constructor c : constructors) {
      System.out.println(c);
    }
  }
}

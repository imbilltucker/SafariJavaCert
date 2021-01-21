package annotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TestRunner {
  public static void main(String[] args) throws Throwable {
    String className = "annotations.UnitUnderTest";
    Class<?> theClass = Class.forName(className);
    Constructor cons = theClass.getConstructor();
    Object obj = cons.newInstance();
    System.out.println(obj);

//    Method [] methods = theClass.getMethods(); // gets "Accessible" methods
    Method [] methods = theClass.getDeclaredMethods(); // Not inherited, but also private :)
    for (Method m : methods) {
      System.out.println("> " + m);
      RunMe annot = m.getAnnotation(RunMe.class);
      if (annot != null) {
        System.out.println("**** RunMe found! name = " + annot.name());
        m.setAccessible(true);
        m.invoke(obj);
      }
    }
  }
}

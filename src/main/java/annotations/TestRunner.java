package annotations;

import java.lang.reflect.Method;

public class TestRunner {
  public static void main(String[] args) throws Throwable {
    String className = "annotations.UnitUnderTest";
    Class<?> theClass = Class.forName(className);
    Method [] methods = theClass.getMethods();
    for (Method m : methods) {
      System.out.println("> " + m);
      RunMe annot = m.getAnnotation(RunMe.class);
      if (annot != null) {
        System.out.println("**** RunMe found!");
      }
    }
  }
}

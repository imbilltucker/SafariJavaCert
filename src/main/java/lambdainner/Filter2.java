package lambdainner;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Filter2 {
  public static <E> List<E> filter(List<E> ls, Criterion<E> crit) {
    List<E> res = new ArrayList<>();
    for (E s : ls) {
      if (crit.test(s)) {
        res.add(s);
      }
    }
    return res;
  }

  public static void main(String[] args) {
    List<String> names = List.of("Fred", "Jim", "Sheila");
    System.out.println(names);
    List<String> longNames = filter(names, new LongString());
    System.out.println(longNames);
    // inner/nested class can have parent class, abstract parent,
    // can implement interface (one!), can implement/override as
    // many methods as you like, can handle constructors
    List<String> firstHalfNames = filter(names, new Criterion<String>() {
      @Override
      public boolean test(String s) {
        return s.charAt(0) < 'M';
      }
    });
    // IF AND ONLY IF...
    // we want to implement an interface,
    // and that interface has exactly ONE ABSTRACT method
    // and we only want to implement that one abstract method.
    // and the "context" demands this interface
    // why should we need to say, implements XXX
    // why should we say "this method"
    List<String> secondHalfNames = filter(names,
        (String s) -> {
          return s.charAt(0) < '>';
        }
        );

//    Criterion<String> obj = (String s) -> {
//      return s.charAt(0) < '>';
//    };

    Criterion<String> obj = (String s) -> s.charAt(0) < '>';

    Class<?> clazz = obj.getClass();
    Method[] methods = clazz.getMethods();
    for (Method m : methods) {
      System.out.println("> " + m);
    }

    System.out.println(firstHalfNames);

    // base lambda
//    List<String> secondHalfNames2 = filter(names,
//        (@Deprecated String s) -> {
//          return s.charAt(0) < '>';
//        }
//    );
    // IF argument types are all unambiguous, can leave out ALL argument types
//    List<String> secondHalfNames2 = filter(names,
//        (s) -> { return s.charAt(0) < '>'; });
    // OR you can replace them ALL with "var"
//    List<String> secondHalfNames2 = filter(names,
//        (@Deprecated var s) -> { return s.charAt(0) < '>'; });
    // SINGLE arg with no type specification, can leave off parens
//    List<String> secondHalfNames2 = filter(names,
//        s -> { return s.charAt(0) < '>'; });
  // if lambda body is simply one return statement, can replace the entire method
    // body with the returned expression
    List<String> secondHalfNames2 = filter(names, s -> s.charAt(0) < '>'  );

//   Criterion<String> sc = String s -> { return s.length() > 3;};
//   Criterion<String> sc = s -> { s.length() > 3 };
//   Object sc = s -> {return s.length() > 3;};
//   Criterion<String> sc = (s) -> s.length() > 3;
//   Criterion<String> sc = s -> s.length();
  }
}

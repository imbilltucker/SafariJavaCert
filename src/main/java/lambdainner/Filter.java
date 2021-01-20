package lambdainner;

import java.util.ArrayList;
import java.util.List;

interface Criterion<E> {
  boolean test(E e);
}

class LongString implements Criterion<String> {
  @Override
  public boolean test(String s) {
    return s.length() > 3;
  }
}

public class Filter {
// static class "nested" non static is called inner
//  static class LongString implements Criterion<String> {
//    @Override
//    public boolean test(String s) {
//      return s.length() > 3;
//    }
//  }

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
    // local class
//    class FirstHalf implements Criterion<String> {
//
//      @Override
//      public boolean test(String s) {
//        return s.charAt(0) < 'M';
//      }
//    }
    List<String> names = List.of("Fred", "Jim", "Sheila");
    System.out.println(names);
    List<String> longNames = filter(names, new LongString());
    System.out.println(longNames);
//    List<String> firstHalfNames = filter(names, new FirstHalf());
    List<String> firstHalfNames = filter(names, new
    /*class FirstHalf implements */Criterion<String>() {
      @Override
      public boolean test(String s) {
        return s.charAt(0) < 'M';
      }
    });
    System.out.println(firstHalfNames);
  }
}

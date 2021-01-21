package lambdainner;

import java.util.function.*;

public class Ex2 {
  public static void main(String[] args) {
//    Function<String, String> fss = s -> { System.out.println(s); };
    Consumer<String> cs = s -> { System.out.println(s); };
//    Supplier<String> ss = (s1, s2) -> s1 + s2;
//    BiPredicate<String> bps = (String s) -> { return s.length() > 0; };
    ToIntFunction<String> tofs = s -> s.length();
  }
}

package usevar;

import java.math.BigDecimal;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex1 {
  // NOT permitted, LOCAL variables only.
//  private var x = "Hello"; // Stylistic, if this has wider scope, be explicit.

  public static int i2;
  public static void main(String[] args) {
    int i1; // local vars must be definitely initialized before reading...
//    if (Math.random() > -1) {
      i1 = 100;
//    }
    System.out.println(i1);
    System.out.println(i2);
//    var x; // NOT allowed, no context for what type x should be

    var x = 99;  // immediate initialization is MANDATORY, it provides the type info
//    x = "Hello"; // NO NO NO, var is "type inferenceing" not dynamic typing

//    var x;
//    x = 100; // NO, delayed intialization NOT permitted

//    var [] x = {1, 3, 5};  // NO var must be the ENTIRE type
    var xarr = new int[]{ 1, 3, 5 };

//    var var = 99; // var is not a keyword, it's a "pseudo-type"

    // var can help with "fluent" programming during development and changes
//    var xyz = function(laksjdflkj).operation();
//    var table =
//        Stream.of(1, 2, 3, 4, 5, 6)
//        .filter(x -> x < 6)
//        .collect(Collectors.groupingBy(x -> x % 3));
//    System.out.println(table);

    // numeric literals in Java are strongly typed
//    var x3 = 4_000_000_000; // range of int is +/- 2 billion ish
    var x3 = 4_000_000_000L; // L suffix makes a long literal

    float f1 = 3.14F; // this IS a double

    // char is Java's ONLY unsigned built in type

    // The only errors from Java's built in arithmetic are div-by-zero
    // on integer types
//    System.out.println(10/0); // exception :)
    System.out.println(10.0/0);
    System.out.println(Double.POSITIVE_INFINITY);
    // BigInteger and BigDecimal, you can get proper error reporting for everything :)
    System.out.println(BigDecimal.ONE.divide(BigDecimal.valueOf(3)));
  }
}

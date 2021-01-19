package usevar;

import java.util.Arrays;

public class ArrayArgs {
//  public void bad(var x) {} // what's x???
  public static void doStuff(int [] args) {
    System.out.println(Arrays.toString(args));
  }

  public static void main(String[] args) {
//    int [] ia = {1,2,3}; // inferencing!!!
    int [] ia = new int[]{1,2,3}; // no inferencing, this is explicit
    doStuff(ia);
//    doStuff({1,2,3}); // NO! Ambiguous
    doStuff(new int[]{1,2,3});
  }
}

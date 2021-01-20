package liskov;

import java.io.IOException;

class Base1 {
  void doBaseStuff()  throws Exception {
    System.out.println("doBaseStuff");
  }
}

class Sub1 extends Base1 {
  void doBaseStuff() throws IOException {
    System.out.println("doSubStuff");
  }

  void doOtherStuff() {
    System.out.println("doOtherStuff");
  }
}

public class Excepts {
}

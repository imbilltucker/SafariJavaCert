package myclient;

import java.lang.reflect.Field;

public class MyClient {
  public static void main(String[] args) throws Throwable {
    System.out.println(myservice.MyService.MESSAGE);
    Class<?> theClass = myservice.MyService.class;
    Field theField = theClass.getDeclaredField("SECRET");
    theField.setAccessible(true);
    System.out.println(theField.get(null));
  }
}

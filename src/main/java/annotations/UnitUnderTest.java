package annotations;


//@RunMe
public class UnitUnderTest {

//  @RunMe
  private int count;

  @RunMe(value="TheValue",name="Fred", classes={String.class, Integer.class})
  public void tryThis() {
    System.out.println("tryThis");
  }

  @RunMe(value="TheValue",name="Fred", classes={String.class, Integer.class})
  private void tryThisSecret() {
    System.out.println("tryThis");
  }

  // only works for "value()" and only when no others are being specified
  @RunMe("Something")
  public void tryThat() {
    System.out.println("tryThat");
  }

  @Override
  public String toString() {
    return "UnitUnderTest{" +
        "count=" + count +
        '}';
  }
}

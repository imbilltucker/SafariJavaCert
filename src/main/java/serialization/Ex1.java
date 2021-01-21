package serialization;

import java.io.*;

class Unhelpful {
  String message;

  public Unhelpful() {
    System.out.println("Calling zero arg constructor for Unhelpful");
  }
  public Unhelpful(String message) {
    System.out.println("Creating an Unhelpful");
    this.message = message;
  }

  @Override
  public String toString() {
    return "Unhelpful{" +
        "message='" + message + '\'' +
        '}';
  }
}
// IF serialization had been invented at Java 5 or later (i.e. after annotations existed)
// this would have been an annotation :)
class MyData extends Unhelpful implements Serializable {
  private static final long serialVersionUID = 5553081380271455378L;
  private int count;
  private String name;
  private String extraInfo = "Extra-Info";
//  private transient Unhelpful bad = new Unhelpful();
  private transient String secret = "my secret message";

  // "normal" initializations are ignored for DE-serialization
  public MyData(int count, String name) {
    super("child's name is " + name);
    System.out.println("Constructing a MyData");
    this.count = count;
    this.name = name;
  }

  public int getCount() {
    return count;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "MyData{" +
        "message='" + message + '\'' +
        ", count=" + count +
        ", name='" + name + '\'' +
        ", extraInfo='" + extraInfo + '\'' +
        ", secret='" + secret + '\'' +
        '}';
  }
}

public class Ex1 {
  public static void main(String[] args) throws Throwable {
//    MyData md = new MyData(99, "Red balloons");
//    System.out.println(md);
//    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.dat"));) {
//      oos.writeObject(md);
//    }
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.dat"))) {
      Object obj = ois.readObject();
      System.out.println(obj);
//      System.out.println(obj == md);
      // if we serialize/deserialize an enum, we WILL get object identity
    }
  }
}

package datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Ex1 {
  public static void main(String[] args) {
    // constructors are so 1995
    // use factory or builder instead
    LocalDate ld = LocalDate.now();
    System.out.println(ld);
    ld = ld.plusDays(3);
    System.out.println(ld);

    System.out.println("Day number is " + ld.get(ChronoField.DAY_OF_MONTH));
//    System.out.println("Hour of day is " + ld.get(ChronoField.HOUR_OF_DAY));

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("'The date is:' d M Y");
    System.out.println(dtf.format(ld));
  }
}

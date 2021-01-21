package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface RunMe {
  // types limited to: primitives, Boxes, String, Class, Annotation,
  // and arrays of the above (but not arrays of arrays)
  String name() default "Unknown";
  Class<?> [] classes() default {};
  String value();

}

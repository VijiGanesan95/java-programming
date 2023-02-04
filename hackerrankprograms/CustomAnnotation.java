package hackerrankprograms;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CustomAnnotation {
	int value();
}

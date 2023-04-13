package repeatable_annotation_sum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MathSumAnnos.class)
public @interface MathSumAnno {
	
	int num1() default 0;
	int num2() default 0;
	

}
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MathSumAnnos {
	
	MathSumAnno[] value();	

}
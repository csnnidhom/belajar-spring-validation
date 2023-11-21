package belajarspring.validation.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PalindromValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Palindrom {

    String message() default "{Palindrom.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}

package com.example.springboot_custom_annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy= {AddressValidator.class})
public @interface AddressValidation
{
    String message() default "fill the correct city name";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

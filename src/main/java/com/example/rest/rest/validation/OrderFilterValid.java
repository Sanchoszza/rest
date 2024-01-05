package com.example.rest.rest.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = OrderFilterValidValidator.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface OrderFilterValid {

    String message() default "Polya pagination have to be write! If you write minCost or maxCost, then both polya have to be write";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

package com.example.Springboot_Custom_Annotation.Validation;

import com.example.Springboot_Custom_Annotation.Validator.AddressValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.METHOD,ElementType.ANNOTATION_TYPE,ElementType.PARAMETER,ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy= {AddressValidator.class}) // Specify your validator class
public @interface AddressValidation
{
    String message() default "fill the correct city name"; //default message
    Class<?>[] groups() default {}; // Required groups parameter
    Class<? extends Payload>[] payload() default{}; // Optional payload parameter

}


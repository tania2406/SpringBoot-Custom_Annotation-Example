package com.example.Springboot_Custom_Annotation.Validator;

import com.example.Springboot_Custom_Annotation.Validation.AddressValidation;
import jakarta.validation.Constraint;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class AddressValidator implements ConstraintValidator<AddressValidation,String>
{
    List<String> address= Arrays.asList("Delhi","Bangalore","Dubai");
    @Override
    public boolean isValid(String value , ConstraintValidatorContext context)
    {
        return address.contains(value);
    }
}

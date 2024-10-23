package com.example.springboot_custom_annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class AddressValidator implements ConstraintValidator<AddressValidation,String>
{
List<String> address= Arrays.asList("Delhi","bangalore","dubai");
@Override
public boolean isValid(String value, ConstraintValidatorContext context)
{
    return address.contains(value);
}

}

package belajarspring.validation.validation;

import belajarspring.validation.helper.StringHelper;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class PalindromValidator implements ConstraintValidator<Palindrom, String> {

    @Autowired
    private StringHelper stringHelper;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return stringHelper.isPalindrom(value);
    }
}

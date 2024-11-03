package com.auca.innovation.crm.core.product.validation;

import com.auca.innovation.crm.core.product.Domain.Product;
import com.auca.innovation.crm.core.utility.IValidationErrorCode;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class ProductValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Product.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Product product = (Product) target;
        ValidationUtils.rejectIfEmpty(errors, Product.Fields.serialNumber, IValidationErrorCode.PRODUCT_SERIAL_NUMBER_REQUIRED_CODE,IValidationErrorCode.PRODUCT_SERIAL_NUMBER_REQUIRED);



    }
}

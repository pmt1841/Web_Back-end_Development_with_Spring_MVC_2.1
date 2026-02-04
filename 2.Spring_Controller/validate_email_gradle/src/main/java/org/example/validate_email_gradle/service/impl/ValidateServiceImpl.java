package org.example.validate_email_gradle.service.impl;

import org.example.validate_email_gradle.service.ValidateService;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ValidateServiceImpl implements ValidateService {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static final Pattern pattern = Pattern.compile(EMAIL_REGEX);


    @Override
    public boolean validate(String regex) {
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

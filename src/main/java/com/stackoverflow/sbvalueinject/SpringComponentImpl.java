package com.stackoverflow.sbvalueinject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class SpringComponentImpl implements SpringComponent {

    @Value("${injected.value}")
    private String injectedValue;


    @Override
    public String getInjectedValue() {
        if (!StringUtils.hasText(injectedValue))
            throw new IllegalStateException("Actual rounding strategy undefined");

        return injectedValue;
    }
}

package com.example.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile("pl")
public class I18NPolishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hejka po polsku :)";
    }
}

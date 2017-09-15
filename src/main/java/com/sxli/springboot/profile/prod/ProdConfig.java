package com.sxli.springboot.profile.prod;

import com.sxli.springboot.profile.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProdConfig implements Config {

    @Value("name")
    private String name;

    @Override
    public void sayHello() {
        System.out.println("Hello,I'm "+name);
    }
}

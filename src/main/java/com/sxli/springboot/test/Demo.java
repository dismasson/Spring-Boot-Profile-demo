package com.sxli.springboot.test;

import com.sxli.springboot.profile.Config;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("prod")
public class Demo {

    @Autowired
    private Config config;

    @Test
    public void DemoTest(){
        config.sayHello();
    }
}

package com.sxli.springboot.profile;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Profile("local")
@ComponentScan(basePackages = "com.sxli.springboot.profile.local")
@PropertySource("classpath:local.properties")
public class LocalProfile {
}

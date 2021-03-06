package org.baeldung.spring.config;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan("org.baeldung.web")
public class WebConfig extends WebMvcConfigurerAdapter {

    @Autowired
    BeanFactory beanFactory;

    public WebConfig() {
        super();
    }

}
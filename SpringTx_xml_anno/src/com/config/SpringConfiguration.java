package com.config;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@ComponentScan("com")
@Configuration
@EnableAspectJAutoProxy
@Import({JdbcConfig.class})
@PropertySource("classpath:com/config/property.properties")
public class SpringConfiguration {
    public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}

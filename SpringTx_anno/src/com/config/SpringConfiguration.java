package com.config;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan("com")
@Configuration
@EnableAspectJAutoProxy
@Import({JdbcConfig.class,TransactionConfig.class})
@PropertySource("classpath:com/config/property.properties")
@EnableTransactionManagement
public class SpringConfiguration {
    public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}

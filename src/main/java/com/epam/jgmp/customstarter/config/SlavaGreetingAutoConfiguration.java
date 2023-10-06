package com.epam.jgmp.customstarter.config;

import com.epam.jgmp.customstarter.service.SlavaGreeting;
import com.epam.jgmp.customstarter.service.SlavaGreetingImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(SlavaGreeting.class)
public class SlavaGreetingAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public SlavaGreeting slavaGreeting() {
        return new SlavaGreetingImpl();
    }
}

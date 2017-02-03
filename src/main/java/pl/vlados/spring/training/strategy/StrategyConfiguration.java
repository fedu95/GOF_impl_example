package pl.vlados.spring.training.strategy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StrategyConfiguration {

    @Bean
    public StrategyNotifyA strategyNotifyA(){
        return new StrategyNotifyA();
    }

    @Bean
    public StrategyNotifyB strategyNotifyB(){
        return new StrategyNotifyB();
    }

}

package com.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class JavaConfig {
    @Bean
    @Primary
    public  Tiger getBeanofTiger(){
        return new Tiger();
    }
    @Bean
    public Monkey getbeanofMonkey(){
        return new Monkey();
    }

   @Bean
    public Zoo getbeanofZoo(@Autowired Animal animal){
        Zoo z=new Zoo();
        z.setName("vazagZoo");
        z.setAnimal(animal);
        return z;
    }
}

package com.noir.config;

import com.noir.Alien;
import com.noir.Computer;
import com.noir.Desktop;
import com.noir.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    public Alien alien(@Qualifier("desktop") Computer com){ //--Qualifier will search of the name of the object
        Alien obj = new Alien();
        obj.setAge(25);
        obj.setCom(com);
        return obj;
    }

    @Bean
    @Primary //-- if there are confusion in object, the object with primary annotation will be selected
    public Laptop laptop(){
        return new Laptop();
    }


//    @Bean(name = "com2") //--single name
//    @Bean(name = {"com2","desktop1","beast"}) //--Multiple name, any name here will work.
    @Bean //-- will use the method name as default name
//    @Scope("prototype")
    public Desktop desktop(){
        return new Desktop();
    }


}

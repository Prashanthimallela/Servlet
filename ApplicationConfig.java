package com.training.spring.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.training.spring.Car;
import com.training.spring.Person;
@Configuration
public class ApplicationConfig {
    @Bean
public Person person() {
     Person p = new Person();
     p.setFristName("Kevin");
     p.setLastName("Peterson");
     p.setAge(40);
     return p;
}
    @Bean
    public Car car() {
        Car c = new Car();
        c.setMake("maruti");
        c.setModel("800");
        c.setYear(2000);
        return c;
    }
}
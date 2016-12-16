package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Ali on 12/7/2016.
 */

//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan({"hello","batch"})
public class Application {

    public static void main(String args[]) {

        SpringApplication.run(Application.class, args);
    }
}

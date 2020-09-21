package guro.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;


@SpringBootApplication
public class SpringmvcApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringmvcApplication.class, args);

        System.out.println("Beans ********");
        System.out.println(ctx.getBeanDefinitionCount());
        //System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));
        System.out.println("Beans ********");
    }

}

package microservicesboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MicroservicesBootApplication extends SpringBootServletInitializer {

    /**
     * Used when run as a JAR
     */

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesBootApplication.class, args);
    }

    /**
     *
     * Used when run as a War
     */


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MicroservicesBootApplication.class);
    }
}


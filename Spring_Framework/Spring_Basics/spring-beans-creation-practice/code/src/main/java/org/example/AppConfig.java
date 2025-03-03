Ppackage org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@ComponentScan
@Configuration
public class AppConfig {

    @Bean ("objectA")
    public GenericManagedObject objectA() {
        return new GenericManagedObject("objectA");
    }

    @Bean ("objectB")
    public GenericManagedObject objectB() {
        return new GenericManagedObject("objectB");
    }

    @Bean ("objectC points to B")
    public GenericManagedObject objectC() {
        return objectB();
    }
}

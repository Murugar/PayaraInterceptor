package com.iqmsoft.payara.intercept;





import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.Optional;


@Named
@ApplicationScoped
public class SomeBean {

    @Failsafe
    public Optional<String> greet() {
        throw new RuntimeException("Failed on purpose");
    }

}

package nl.dubisoft.propertytest.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

    private String myKey;

    @Autowired
    public MyBean(@Value("${myKey:defaultValue}") String myKey) {
        this.myKey = myKey;
    }

    public String getMyKey() {
        return myKey;
    }
}

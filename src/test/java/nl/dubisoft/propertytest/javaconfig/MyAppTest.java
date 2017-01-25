package nl.dubisoft.propertytest.javaconfig;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyAppTest {

    @Test
    public void test_context() {
        for (int i = 0; i < 100; i++) {
            ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
            MyBean myBean = applicationContext.getBean(MyBean.class);
            assertEquals("value2", myBean.getMyKey());
        }
    }
}

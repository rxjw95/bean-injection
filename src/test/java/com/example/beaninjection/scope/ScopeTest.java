package com.example.beaninjection.scope;

import org.junit.jupiter.api.RepeatedTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class ScopeTest {

    @Autowired
    ApplicationContext context;

    @RepeatedTest(value = 5)
    void singletonScope() {
        assertEquals(context.getBean(SingletonObj.class), context.getBean(SingletonObj.class));
    }

    @RepeatedTest(value = 5)
    void prototypeScope() {
        assertNotEquals(context.getBean(ProtoObj.class), context.getBean(ProtoObj.class));
    }
}

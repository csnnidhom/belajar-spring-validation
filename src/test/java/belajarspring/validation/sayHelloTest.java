package belajarspring.validation;

import belajarspring.validation.helper.SayHello;
import jakarta.validation.ConstraintDeclarationException;
import jakarta.validation.ConstraintViolationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class sayHelloTest {

    @Autowired
    private SayHello sayHello;

    @Test
    void testSuccess() {
        String messages = sayHello.sayHello("nidhom");
        Assertions.assertEquals("Hello nidhom", messages);
    }

    @Test
    void testError() {
        Assertions.assertThrows(ConstraintViolationException.class, () -> {
           sayHello.sayHello("") ;
        });
    }
}

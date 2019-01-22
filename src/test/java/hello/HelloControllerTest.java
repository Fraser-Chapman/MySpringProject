package hello;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloControllerTest {

    private HelloController testSubject;

    @Test
    public void indexReturnsGreeting() {
        testSubject = new HelloController();
        Assertions.assertThat(testSubject.index()).isEqualTo("Greetings from Spring Boot!!!");
    }

}
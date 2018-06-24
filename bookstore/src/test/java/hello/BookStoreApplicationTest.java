package hello;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BookStoreApplicationTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void recommendedTest() {
        String response = restTemplate.getForObject("/recommended", String.class);
        assertEquals("Spring in Action (Meaning), Could Native Java (O' Reilly), Learning Spring Boot (Pact)", response);
    }
}
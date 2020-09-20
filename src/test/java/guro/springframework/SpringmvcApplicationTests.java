package guro.springframework;

import guro.springframework.Controllers.IndexControllersTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringmvcApplicationTests {

    @Test
    void contextLoads() {
        IndexControllersTest indexControllersTest = new IndexControllersTest();
        indexControllersTest.setup();
        try {
            indexControllersTest.testIndex();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

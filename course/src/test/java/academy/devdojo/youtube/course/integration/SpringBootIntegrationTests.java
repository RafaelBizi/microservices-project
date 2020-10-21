package academy.devdojo.youtube.course.integration;

import academy.devdojo.youtube.core.model.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class SpringBootIntegrationTests {
    private final String SERVER_URL = "http:/localhost";
    private final String THINGS_ENDPOINT = "/gateway/course/v1/admin/course";

    private RestTemplate restTemplate;

    public SpringBootIntegrationTests() {
        this.restTemplate = new RestTemplate();
    }

    @LocalServerPort
    protected int port;

    private String thingsEndpoint(){
        return SERVER_URL + ":" + port + THINGS_ENDPOINT;
    }

        @Test
        public int getCourseByIdWhenIdIsCorrectStatusCodeShouldBe200(Integer id){
        this.restTemplate = new RestTemplate();
        return restTemplate
                .getForEntity("http://localhost:8080/gateway/course/v1/admin/course/"+id,Course.class)
                .getStatusCodeValue();
    }

}

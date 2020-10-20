package academy.devdojo.youtube.course.stepdefinitions;

import academy.devdojo.youtube.core.model.Course;
import academy.devdojo.youtube.core.repository.CourseRepository;
import academy.devdojo.youtube.course.endpoint.controller.CourseController;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class CourseEndpointStepdefs {

    // simula uma alteração no banco de dados
    @MockBean
    private CourseRepository courseRepository;
    private CourseController courseController;

    @Autowired
    private TestRestTemplate restTemplate;

    @LocalServerPort
    private int port;

    // outra forma de criar o MockBean, nesse caso precisamos da anotação @AutoConfigureMockMvc
    @Autowired
    private MockMvc mockMvc;

    private Course course = new Course();

    @Given("I'm accessing the URL {string}")
    public void i_m_accessing_the_URL(String URL) throws Throwable{
        // Write code here that turns the phrase above into concrete actions
        URL = "http://localhost:8080/courses";
        System.out.println("I'm accessing the URL:" + URL);
    }

    @Test
    @Given("^I can create a new course$")
    public void iCanCreateANewCourse() throws Throwable{
        System.out.println("I can create a new course: ");
        ResponseEntity<Course[]> response = restTemplate
                .getForEntity("http://localhost:8080/gateway/course/v1/admin/course",Course[].class);
        Assertions.assertThat(response.getStatusCodeValue()).isEqualTo(200);
    }

    @And("I'm sending post method to be created with {int} and {string}")
    public void i_m_sending_post_method_to_be_created_with_id_title_cucumber_tutorial_test(Integer id, String tittle) throws Throwable {
        System.out.println("I'm sending post method to be created with "+id+" and "+tittle);
    }

    @Then("^I should be able to see my newly created course$")
    public void iShouldBeAbleToSeeMyNewlyCreatedCourse() throws Throwable {
        System.out.println("I should be able to see my newly created course");
    }

    @Given("I can list all the courses registered into DB")
    public void i_can_list_all_the_courses_registered_into_db() throws Throwable{
        System.out.println("I can list all the courses");
    }

    @And("I'm sending a get method to list all the courses")
    public void i_m_sending_a_get_method_to_list_all_the_courses() throws Throwable{
        System.out.println("I'm sending a get method to list all the courses");
    }

    @Then("I should be able to see all the courses")
    public void i_should_be_able_to_see_all_the_courses() throws Throwable{
        System.out.println("I should be able to see all the courses listed");
    }
}

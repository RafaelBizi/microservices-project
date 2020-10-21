package academy.devdojo.youtube.course.stepdefinitions;

import academy.devdojo.youtube.core.model.Course;
import academy.devdojo.youtube.core.repository.CourseRepository;
import academy.devdojo.youtube.course.endpoint.controller.CourseController;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class CreatingNewCourseStepdefs {
    private Map<Integer, String> createCourseMap = new HashMap<>();

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
        ResponseEntity<Course> response = restTemplate
                .getForEntity("http://localhost:8080/gateway/course/v1/admin/course/4",Course.class);
        Assertions.assertThat(response.getStatusCodeValue()).isEqualTo(200);
        System.out.println("I can create a new course: ");
    }

    @When("I'm sending post method to add a course with {int} and {string}")
    public void i_m_sending_post_method_to_add_a_course_with_and(Integer id, String title) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I'm sending post method to add a course with id 10 and course name 'Testing cucumber'");
    }

    @Then("I should be able to list my newly created course")
    public void i_should_be_able_to_list_my_newly_created_course() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I should be able to list my newly created course");
    }

    @Given("I can create two new courses")
    public void i_can_create_two_new_courses() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I can create two new courses");
    }

    @And("I'm sending a get method to list all the courses")
    public void i_m_sending_a_get_method_to_list_all_the_courses() throws Throwable{
        System.out.println("I'm sending a get method to list all the courses");
    }

    @Then("I should be able to list my newly created courses")
    public void i_should_be_able_to_list_my_newly_created_courses() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I should be able to list my newly created courses");
    }

}

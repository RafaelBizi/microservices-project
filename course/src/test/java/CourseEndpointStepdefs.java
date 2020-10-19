import academy.devdojo.youtube.core.model.Course;
import academy.devdojo.youtube.core.repository.CourseRepository;
import academy.devdojo.youtube.course.endpoint.controller.CourseController;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lombok.extern.log4j.Log4j2;
import org.assertj.core.api.Assertions;
import org.assertj.core.util.Lists;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static java.util.Arrays.asList;
import static org.springframework.http.HttpMethod.DELETE;
import static org.springframework.http.HttpMethod.GET;
import static org.springframework.http.HttpMethod.POST;

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
    private static HttpEntity<Void> userHeader;

    @Given("^I can create a new course$")
    public void iCanCreateANewCourse() throws Exception{
        System.out.println("I can create a new course: ");
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

package academy.devdojo.youtube.course.stepdefinitions;

import academy.devdojo.youtube.course.integration.SpringBootIntegrationTests;
import io.cucumber.java.en.Given;
import org.assertj.core.api.Assertions;

public class CallingWebServicesStepdefs extends SpringBootIntegrationTests {
    @Given("^Ok suck me$")
    public void Ok_working() {
        // Write code here that turns the phrase above into concrete actions
        Assertions.assertThat(getCourseByIdWhenIdIsCorrectStatusCodeShouldBe200(4)).isEqualTo(200);
        System.out.println("Ok working");
    }
}

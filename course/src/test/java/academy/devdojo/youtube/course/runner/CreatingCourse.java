package academy.devdojo.youtube.course.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( features = "src\\test\\resources\\features\\CallingWebService.feature")
public class CreatingCourse {
}



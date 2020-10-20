package academy.devdojo.youtube.course.utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before(order = 0)
    public void beforeScenarioStart(){
        System.out.println("-----------------Start of Scenario-----------------");
    }

    @After(order = 0)
    public void afterScenarioFinish(){
        System.out.println("-----------------End of Scenario-----------------");
    }

    @Before(value = "@Hook", order = 1)
    public void beforeHookScenario(){
        System.out.println("This will run before the Scenario");
    }

    @After(value = "@Hook", order = 1)
    public void afterHookScenario(){
        System.out.println("This will run after the Scenario");
    }

    @Before(value = "@CourseEndpointTesting", order = 1)
    public void beforeCourseEndpointScenario() {
        System.out.println("Before Course Endpoint");
    }

    @After(value = "@CourseEndpointTesting", order = 1)
    public void afterCourseEndpointScenario() {
        System.out.println("After Course Endpoint");
    }

}
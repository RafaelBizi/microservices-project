@CourseEndpointTesting
Feature: Course endpoints testing
  * I will test all endpoints of my application

 Background: User is accessing the 'new course' URL
   * I'm accessing the URL ""

 @CreateCourseTesting
 Scenario Outline: As a User I want to create a new course.
   Given I can create a new course
   And I'm sending post method to be created with <id> and "<title>"
   Then I should be able to see my newly created course

   Examples:
   | id | title           |
   | 10 | Cucumber course |
   | 11 | Junit course    |

 @ListCourseTesting
 Scenario: As a User I want to list all the courses.
   Given I can list all the courses registered into DB
   And I'm sending a get method to list all the courses
   Then I should be able to see all the courses
@CreatingCourse
Feature: Creating course

 Background: User is accessing the 'new course' URL
   * I'm accessing the URL ""

 @CreatingCourseOne
 Scenario: As a User I want to create a new course
   Given I can create a new course
   When I'm sending post method to add a course with 10 and "<title>"
   Then I should be able to list my newly created course

  @CreatingCourseTwo
  Scenario: As a User I want to create 2 new courses
    Given  I can create two new courses
    When I'm sending post method twice to create the courses
      |15 | Cucumber testing   |
      |16 | Cucumber testing 2 |
    Then I should be able to list my newly created courses

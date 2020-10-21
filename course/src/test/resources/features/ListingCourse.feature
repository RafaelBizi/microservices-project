@CourseListing
Feature: Listing courses

  @CourseListingOne
  Scenario: As a User I want to list one course
    Given I can list a course
    And I'm sending a get method to find the course with id 10
    Then The course should be listed.

  @CourseListingAll
  Scenario: As a User I want to list the courses
    Given I can list all the courses registered into DB
    And I'm sending a get method to list all the courses
    Then All the courses should be listed

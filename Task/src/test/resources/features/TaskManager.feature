Feature: Task Management
  As a user,
  I want to manage my tasks
  So that I can track my work efficiently

  Scenario: Add a new task
    Given I have a TaskManager application
    When I add a new task with title "Learn TDD"
    Then the task should be created successfully
    And the task should have a unique ID
    And the task should be marked as incomplete

  Scenario: Get a task by ID
    Given a task with title "Learn TDD" exists
    When I retrieve the task by its ID
    Then I should get the task details
    And the title should be "Learn TDD"
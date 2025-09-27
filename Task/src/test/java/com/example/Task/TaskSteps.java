package com.example.Task;

import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.*;

public class TaskSteps {

    private TaskService taskService;
    private Task task;
    private boolean deleteResult;
    private Task retrievedTask;

    @Given("I have a TaskManager application")
    public void i_have_a_task_manager_application() {
        taskService = new TaskService();
    }

    @When("I add a new task with title {string}")
    public void i_add_a_new_task_with_title(String title) {
        task = new Task(title);
        task = taskService.addTask(task);
    }

    @Then("the task should be created successfully")
    public void the_task_should_be_created_successfully() {
        assertNotNull(task);
    }

    @Then("the task should have a unique ID")
    public void the_task_should_have_a_unique_id() {
        assertNotNull(task.getId());
    }

    @Then("the task should be marked as incomplete")
    public void the_task_should_be_marked_as_incomplete() {
        assertFalse(task.isCompleted());
    }

    @Given("a task with title {string} exists")
    public void a_task_with_title_exists(String title) {
        taskService = new TaskService();
        task = new Task(title);
        task = taskService.addTask(task);
    }

    @When("I retrieve the task by its ID")
    public void i_retrieve_the_task_by_its_id() {
        retrievedTask = taskService.getTaskById(task.getId());
    }

    @Then("I should get the task details")
    public void i_should_get_the_task_details() {
        assertNotNull(retrievedTask);
    }

    @Then("the title should be {string}")
    public void the_title_should_be(String expectedTitle) {
        assertEquals(expectedTitle, retrievedTask.getTitle());
    }

}
